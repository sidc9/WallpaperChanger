package siddhanta.wallpaperchanger;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

/**
 * Created by Sidd.c on 4/8/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[];
    int NumOfTabs;

    public ViewPagerAdapter (FragmentManager fm, CharSequence mTitles[], int mNumOfTabs) {
        super(fm);

        this.Titles = mTitles;
        this.NumOfTabs = mNumOfTabs;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            Tab1 tab1 = new Tab1();
            return tab1;
        }
        else
        {
            Tab2 tab2 = new Tab2();
            return tab2;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    @Override
    public  int getCount(){
        return NumOfTabs;
    }
}
