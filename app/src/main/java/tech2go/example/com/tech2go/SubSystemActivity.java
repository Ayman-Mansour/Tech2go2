package tech2go.example.com.tech2go;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class SubSystemActivity extends AppCompatActivity {
    private RVArrayAdapter_Sub_Systems adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_system);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        /*getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
        android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) findViewById(R.id.systems_list);
        ImageView imageView = (ImageView) findViewById(R.id.awareness_image);
        ImageView imageViewBG = (ImageView) findViewById(R.id.system_details_bg);
        ScrollingActivity.setScaleAnimation(imageViewBG);
        Intent i = getIntent();
        Bundle a = i.getExtras();
        String menu1 = "awareness_1";
        String menu2 = "awareness_2";
        String menu3 = "awareness_3";
        String menu4 = "awareness_4";
        String menu5 = "awareness_5";
        String menu6 = "awareness_6";
        String menu7 = "awareness_7";
        String menu8 = "awareness_8";
        String menu9 = "awareness_9";
        String[] sections;
        String[] sections_description;
        int[] sections_id;

        if (a.containsKey(menu1)) {
            imageView.setImageResource(R.drawable.designing);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.system_list)[0]);
            sections = getResources().getStringArray(R.array.lowcurrent_system_list);
            sections_description = new String[]{"6", "7", "8", "9", "10", ""};
            sections_id = new int[]{R.drawable.confernce, R.drawable.cctv,
                    R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                    R.drawable.security};
            adapter = new RVArrayAdapter_Sub_Systems(this, getData(sections,
                    sections_description, sections_id));
           /* textView.setText(R.string.conference_des);
           if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                imageView.setTransitionName("accidant" + "0");

              //  Toast.makeText(getBaseContext(), imageView.getTransitionName(), Toast.LENGTH_LONG).show();
//                supportPostponeEnterTransition();
            }
            imageView.setImageResource(R.drawable.confernce);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.system_list)[0]);*/

        } else if (a.containsKey(menu2)) {
            imageView.setImageResource(R.drawable.ict);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.system_list)[1]);
            sections = getResources().getStringArray(R.array.lowcurrent_system_list);
            sections_description = new String[]{"6", "7", "8", "9", "10", ""};
            sections_id = new int[]{R.drawable.confernce, R.drawable.cctv,
                    R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                    R.drawable.security};
            adapter = new RVArrayAdapter_Sub_Systems(this, getData(sections,
                    sections_description, sections_id));

        } else if (a.containsKey(menu3)) {
            imageView.setImageResource(R.drawable.consultation);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.system_list)[2]);
            sections = getResources().getStringArray(R.array.lowcurrent_system_list);
            sections_description = new String[]{"6", "7", "8", "9", "10", ""};
            sections_id = new int[]{R.drawable.confernce, R.drawable.cctv,
                    R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                    R.drawable.security};
            adapter = new RVArrayAdapter_Sub_Systems(this, getData(sections,
                    sections_description, sections_id));

        } else if (a.containsKey(menu4)) {
            imageView.setImageResource(R.drawable.training);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.system_list)[3]);
            sections = getResources().getStringArray(R.array.lowcurrent_system_list);
            sections_description = new String[]{"6", "7", "8", "9", "10", ""};
            sections_id = new int[]{R.drawable.confernce, R.drawable.cctv,
                    R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                    R.drawable.security};
            adapter = new RVArrayAdapter_Sub_Systems(this, getData(sections,
                    sections_description, sections_id));

        } else if (a.containsKey(menu5)) {
            imageView.setImageResource(R.drawable.smarthome);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.system_list)[4]);
            sections = getResources().getStringArray(R.array.lowcurrent_system_list);
            sections_description = new String[]{"6", "7", "8", "9", "10", ""};
            sections_id = new int[]{R.drawable.confernce, R.drawable.cctv,
                    R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                    R.drawable.security};
            adapter = new RVArrayAdapter_Sub_Systems(this, getData(sections,
                    sections_description, sections_id));

        } else if (a.containsKey(menu6)) {
            imageView.setImageResource(R.drawable.planning);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.system_list)[5]);
            sections = getResources().getStringArray(R.array.lowcurrent_system_list);
            sections_description = new String[]{"6", "7", "8", "9", "10", ""};
            sections_id = new int[]{R.drawable.confernce, R.drawable.cctv,
                    R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                    R.drawable.security};
            adapter = new RVArrayAdapter_Sub_Systems(this, getData(sections,
                    sections_description, sections_id));

        } else if (a.containsKey(menu7)) {
            imageView.setImageResource(R.drawable.hvac);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.system_list)[6]);
            sections = getResources().getStringArray(R.array.lowcurrent_system_list);
            sections_description = new String[]{"6", "7", "8", "9", "10", ""};
            sections_id = new int[]{R.drawable.confernce, R.drawable.cctv,
                    R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                    R.drawable.security};
            adapter = new RVArrayAdapter_Sub_Systems(this, getData(sections,
                    sections_description, sections_id));

        } else if (a.containsKey(menu8)) {
            imageView.setImageResource(R.drawable.internal);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.system_list)[7]);
            sections = getResources().getStringArray(R.array.lowcurrent_system_list);
            sections_description = new String[]{"6", "7", "8", "9", "10", ""};
            sections_id = new int[]{R.drawable.confernce, R.drawable.cctv,
                    R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                    R.drawable.security};
            adapter = new RVArrayAdapter_Sub_Systems(this, getData(sections,
                    sections_description, sections_id));

        } else if (a.containsKey(menu9)) {
            imageView.setImageResource(R.drawable.lowcurrent);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.system_list)[8]);
            sections = getResources().getStringArray(R.array.lowcurrent_system_list);
            sections_description = new String[]{"6", "7", "8", "9", "10", ""};
            sections_id = new int[]{R.drawable.confernce, R.drawable.cctv,
                    R.drawable.ic_volume_up_black_24dp, R.drawable.access, R.drawable.tvsystem,
                    R.drawable.security};
            adapter = new RVArrayAdapter_Sub_Systems(this, getData(sections,
                    sections_description, sections_id));

        }


        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public List<Information> getData(String[] sections, String[] sections_description, int[] sections_id) {
        List<Information> data = new ArrayList<>();
      /*  String[] sections = getResources().getStringArray(R.array.system_list);
        String[] sections_description = {"6","7","8","9","10","","9","10",""};
        int[] sections_id = {R.drawable.confernce,R.drawable.cctv,
                R.drawable.ic_volume_up_black_24dp,R.drawable.access,R.drawable.tvsystem,
                R.drawable.security,
                R.drawable.ic_volume_up_black_24dp,R.drawable.access,R.drawable.tvsystem,
                R.drawable.security};*/
        for (int i = 0; i < sections.length && i < sections_id.length; i++) {

            Information current = new Information();
            current.icon_id = sections_id[i];
            current.icon_lable = sections[i];
            current.icon_description = sections_description[i];
            data.add(current);

        }
        return data;

    }

    private void setCollapsingToolbarLayoutTitle(String title) {
        CollapsingToolbarLayout mCollapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        mCollapsingToolbarLayout.setTitle(title);
        mCollapsingToolbarLayout.setCollapsedTitleGravity(View.TEXT_ALIGNMENT_GRAVITY);
//        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBar);
//        mCollapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBar);
//        mCollapsingToolbarLayout.setExpandedTitleTextAppearance(R.style.ExpandedAppBarPlus1);
//        mCollapsingToolbarLayout.setCollapsedTitleTextAppearance(R.style.CollapsedAppBarPlus1);
    }
}
