package tech2go.example.com.tech2go;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    public void changeView(int id){
        Fragment fragment = null;
        switch (id){
            case R.id.navigation_home:
                fragment=new HomeFragment();
                break;
            case R.id.navigation_systems:
                fragment=new SystemsFragment();
                break;
            case R.id.navigation_standers:
                fragment=new StandersFragment();
                break;
            /*case R.id.navigation_map:
                fragment=new AboutFragment();
                break;*/
            case R.id.navigation_contact:
                fragment= new ContactusFragment();
                break;
            case R.id.navigation_about:
                fragment=new AboutFragment();
                break;
        }
        if (fragment != null) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                fragmentTransaction.setCustomAnimations(R.anim.fragment_enter_left,R.anim.fragment_exit_right);
            fragmentTransaction.replace(R.id.content,fragment);
            fragmentTransaction.commit();
        }
//            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//            drawer.closeDrawer(GravityCompat.START);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                changeView(id);

            return true;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        changeView(R.id.navigation_home);
    }

}
