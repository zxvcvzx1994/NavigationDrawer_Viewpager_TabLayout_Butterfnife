package com.example.kh.myapplication.Module.Fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.kh.myapplication.View.Fragment.Fragment_Main;
import com.example.kh.myapplication.View.Fragment.Fragment_Watch_Film;

/**
 * Created by kh on 6/22/2017.
 */

public class MyViewPager extends FragmentPagerAdapter {

    public MyViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment =null;
        if(position==0){
            fragment = new Fragment_Main();
        }else{
            fragment  =new Fragment_Watch_Film();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if(position==0){
            return  "Main";
        }else{
            return "Watch Film";
        }

    }


}
