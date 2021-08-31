package tech2go.example.com.tech2go;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    public View rootView;
    android.support.design.widget.FloatingActionButton btn;
    private RVArrayAdapter_Fragment_Home adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_home, container, false);
        final android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) rootView.findViewById(R.id.home_list);

        adapter = new RVArrayAdapter_Fragment_Home(getContext(), getData());
        recyclerView.setAdapter(adapter);
        GridLayoutManager lm =
                new GridLayoutManager(getActivity(),3);
        lm.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                if (position % 3 == 2) {
                    return 3;
                }
                switch (position % 4) {
                    case 1:
                    case 3:
                        return 1;
                    case 0:
                    case 2:
                        return 2;
                    default:
                        //never gonna happen
                        return  -1 ;
                }
            }
        });
        recyclerView.setLayoutManager(lm);
        return rootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Home");
    }

    public List<Information> getData() {
        List<Information> data = new ArrayList<>();
        String[] sections = getResources().getStringArray(R.array.home_list);
        String[] sections_description = {"6", "7", "8", "9", "10", "", "9", "10", "","6", "7", "8", "9", "10", "", "9", "10", ""};
        int[] sections_id = {R.drawable.confernce, R.drawable.cctv,
                R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                R.drawable.security,
                R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                R.drawable.security,R.drawable.confernce, R.drawable.cctv,
                R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                R.drawable.security,
                R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                R.drawable.security};
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
