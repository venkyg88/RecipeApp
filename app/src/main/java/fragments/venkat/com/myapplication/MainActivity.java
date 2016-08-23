package fragments.venkat.com.myapplication;



import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import fragments.venkat.com.myapplication.ui.BaseFragment;
import fragments.venkat.com.myapplication.ui.DetailFragment;
import fragments.venkat.com.myapplication.ui.NewsViewPagerFragment;
import fragments.venkat.com.myapplication.ui.PoliticsFragment;

public class MainActivity extends AppCompatActivity implements PoliticsFragment.onHeadLinesSelectedInterface {

    public static final String VIEW_PAGER_LIST_FRAGMENT = "list_fragment";
    public static final String VIEWPAGER = "viewpager";
    public static final String DETAIL_FRAGMENT = "detail_fragment" ;
    /*@Override
    public void onBackPressed() {
        super.onBackPressed();
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boolean isTablet = getResources().getBoolean(R.bool.is_tablet);


        //if (!isTablet) { //code for phone
            NewsViewPagerFragment savedFragment = (NewsViewPagerFragment) getSupportFragmentManager().findFragmentByTag(VIEWPAGER);
            if ( savedFragment == null) {
                NewsViewPagerFragment viewPagerFragment = new NewsViewPagerFragment();
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.placeHolder, viewPagerFragment, VIEW_PAGER_LIST_FRAGMENT);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

    }

    @Override
    public void onHeadLinesItemSelected(int index) {
        //Toast.makeText(this, index+"", Toast.LENGTH_LONG).show();
        DetailFragment detailFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(DetailFragment.INDEX, index);
        detailFragment.setArguments(bundle);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.placeHolder, detailFragment, DETAIL_FRAGMENT);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    /*@Override
    public void onListRecipeSelected(int index) {
        ViewPagerFragment listFragment = new ViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ViewPagerFragment.KEY_RECIPE_INDEX, index);
        listFragment.setArguments(bundle);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.placeHolder, listFragment, VIEWPAGER);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onGridRecipeSelected(int index) {
        DualPaneFragment listFragment = new DualPaneFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ViewPagerFragment.KEY_RECIPE_INDEX, index);
        listFragment.setArguments(bundle);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.placeHolder, listFragment, VIEWPAGER);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }*/



}
