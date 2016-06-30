package com.example.baguzzzaji.bandungbermartabat;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by baguzzzaji on 6/30/16.
 */
public class PlaceFragmentAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] {"Parks", "Univ", "Mosques", "Holiday"};

    public PlaceFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new ParkFragment();
            case 1:
                return new UniversityFragment();
            case 2:
                return new MosqueFragment();
            default:
                return new HolidayFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}
