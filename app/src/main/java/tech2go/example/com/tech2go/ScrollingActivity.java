package tech2go.example.com.tech2go;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.TransitionInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class ScrollingActivity extends AppCompatActivity {
    private final static int FADE_DURATION = 500; // in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setSharedElementEnterTransition(TransitionInflater.from(this).inflateTransition(R.transition.transition));
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        /*setSupportActionBar((Toolbar) toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/
        TextView textView = (TextView) findViewById(R.id.awareness_detail);
        ImageView imageView = (ImageView) findViewById(R.id.awareness_image);
        ImageView imageViewBG = (ImageView) findViewById(R.id.system_details_bg);
        setScaleAnimation(imageViewBG);
        setSupportActionBar(toolbar);
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
        if (a.containsKey(menu1)) {
            textView.setText(R.string.conference_des);
           /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                imageView.setTransitionName("accidant" + "0");

              //  Toast.makeText(getBaseContext(), imageView.getTransitionName(), Toast.LENGTH_LONG).show();
//                supportPostponeEnterTransition();
            }*/
            imageView.setImageResource(R.drawable.confernce);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.lowcurrent_system_list)[0]);

    }else if(a.containsKey(menu2)) {
            textView.setText(R.string.cctv_des);
          /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                imageView.setTransitionName("accidant" + "0");

              //  Toast.makeText(getBaseContext(), imageView.getTransitionName(), Toast.LENGTH_LONG).show();
//                supportPostponeEnterTransition();
            }*/
            imageView.setImageResource(R.drawable.cctv);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.lowcurrent_system_list)[1]);
        }else if(a.containsKey(menu3)) {
            textView.setText("");
          /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                imageView.setTransitionName("accidant" + "0");

              //  Toast.makeText(getBaseContext(), imageView.getTransitionName(), Toast.LENGTH_LONG).show();
//                supportPostponeEnterTransition();
            }*/
            imageView.setImageResource(R.drawable.ic_volume_up_black_24dp);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.lowcurrent_system_list)[2]);
        }else if(a.containsKey(menu4)) {
            textView.setText(R.string.access_des);
          /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                imageView.setTransitionName("accidant" + "0");

              //  Toast.makeText(getBaseContext(), imageView.getTransitionName(), Toast.LENGTH_LONG).show();
//                supportPostponeEnterTransition();
            }*/
            imageView.setImageResource(R.drawable.access);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.lowcurrent_system_list)[3]);
        }else if(a.containsKey(menu5)) {
            textView.setText("");
          /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                imageView.setTransitionName("accidant" + "0");

              //  Toast.makeText(getBaseContext(), imageView.getTransitionName(), Toast.LENGTH_LONG).show();
//                supportPostponeEnterTransition();
            }*/
            imageView.setImageResource(R.drawable.tvsystem);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.lowcurrent_system_list)[4]);
        }
        else if(a.containsKey(menu6)) {
            textView.setText("");
          /*  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//                imageView.setTransitionName("accidant" + "0");

              //  Toast.makeText(getBaseContext(), imageView.getTransitionName(), Toast.LENGTH_LONG).show();
//                supportPostponeEnterTransition();
            }*/
            imageView.setImageResource(R.drawable.security);
            setCollapsingToolbarLayoutTitle(getResources().getStringArray(R.array.lowcurrent_system_list)[5]);
        }
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
        }


        return super.onOptionsItemSelected(item);
    }

    public static void setScaleAnimation(View view) {
        ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        anim.setDuration(FADE_DURATION);
        view.startAnimation(anim);
    }
}
