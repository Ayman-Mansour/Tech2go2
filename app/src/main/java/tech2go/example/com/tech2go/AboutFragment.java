package tech2go.example.com.tech2go;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.id.list;


public class AboutFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("About");
        ListView list = (ListView) view.findViewById(R.id.timeline_list);
        String items [] = {"Tech 2 Go is set to introduce a new standard of " +
                "excellence in engineering systems " +
                "(Construction, Smart-home systems, Residential & Commercial Safety & Security systems; etc...)","We do our best to offer clients the very best solutions demanded to utilize and achieve their" +
                " maximum goals, in different aspects of security and media services. ","Our commitment to customers is providing the most advanced " +
                "technologies available in today’s market with a futuristic vision; ","we select partners with high regard to accomplishment and ingenuity, so we are proud to introduce our ambitious " +
                "relationship with the brands we use in our solutions.","Tech 2 Go creates and cultivates long-term relationships with clients to provide satisfactory results. ",
                "We aspire to continuously improve services in order to maintain complete client satisfaction and the highest possible standards of performance.","" +
                "Founded in Jan 2016"};

        list.setAdapter(new ArrayAdapter<String>(getContext(),R.layout.timeline_item, R.id.textView1,items ));

        /*String[] data =
                {"today - sunny - 88/63",
                        "tomorrow - foggy - 70/40",
                        "Weds - cloudy - 72/63",
                        "Thurs - Asteroids -75/65",
                        "Fri - Heavy Rain - 65/56",
                        "Sat - HELP TRAPPED IN WEATHER STATION - 60/51",
                        "Sun - sunny - 80/68"
                };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));
        //ForecastAdapter
        ArrayAdapter<String> forecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textView,
                weekForecast);
        rootView = inflater.inflate(R.layout.fragment_my, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listView_forecast);

        listView.setAdapter(forecastAdapter);*/
    }
}
