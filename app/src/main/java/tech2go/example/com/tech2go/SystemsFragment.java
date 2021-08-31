package tech2go.example.com.tech2go;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class SystemsFragment extends Fragment {

   public View rootView;
    android.support.design.widget.FloatingActionButton btn;
    private RVArrayAdapter_Fragment_Systems adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_systems, container, false);
//        ListView listview = (ListView) rootView.findViewById(R.id.list_a);
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) rootView.findViewById(R.id.systems_list);
        adapter = new RVArrayAdapter_Fragment_Systems(getContext(),getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        return rootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Systems");
    }

    public List<Information> getData() {
        List<Information> data = new ArrayList<>();
        String[] sections = getResources().getStringArray(R.array.system_list);
        String[] sections_description = {"6","7","8","9","10","","9","10",""};
        int[] sections_id = {R.drawable.designing,R.drawable.ict,
                R.drawable.consultation,R.drawable.training,R.drawable.smarthome,
                R.drawable.planning,
                R.drawable.hvac,R.drawable.internal,R.drawable.lowcurrent};
        for (int i = 0; i < sections.length && i < sections_id.length; i++) {

            Information current = new Information();
            current.icon_id = sections_id[i];
            current.icon_lable = sections[i];
            current.icon_description = sections_description[i];
            data.add(current);

        }
        return data;

    }




}
