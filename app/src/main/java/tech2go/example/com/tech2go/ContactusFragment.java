package tech2go.example.com.tech2go;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;


public class ContactusFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contactus, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {


        Button facebookBTN = (Button) view.findViewById(R.id.facebook);
        Button twitterBTN = (Button) view.findViewById(R.id.twitter);
        Button instagramBTN = (Button) view.findViewById(R.id.instagram);
        Button mailBTN = (Button) view.findViewById(R.id.mail);
        FloatingActionButton locationBTN = (FloatingActionButton) view.findViewById(R.id.location_button);

        facebookBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                final String urlFb1 = "fb://page/530387500445728";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urlFb1));

    // If a Facebook app is installed, use it. Otherwise, launch
    // a browser
                final PackageManager packageManager1 = getActivity().getPackageManager();
                List<ResolveInfo> list1 =
                        packageManager1.queryIntentActivities(intent,
                                PackageManager.MATCH_DEFAULT_ONLY);
                if (list1.size() == 0) {
                    final String urlBrowser = "https://www.facebook.com/algafarigisco/";
                    intent.setData(Uri.parse(urlBrowser));
                }

                startActivity(intent);
            }
        });

        twitterBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "TWITTER !!!", Toast.LENGTH_SHORT).show();
            }
        });

        instagramBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "INSTAGRAM !!!", Toast.LENGTH_SHORT).show();
            }
        });

        mailBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MessageActivity.class);
                startActivity(intent);
            }
        });

        locationBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), LocationActivity.class);
                startActivity(intent);
            }
        });
        getActivity().setTitle("Contact us");
    }

}
