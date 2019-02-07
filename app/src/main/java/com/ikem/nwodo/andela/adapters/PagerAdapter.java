package com.ikem.nwodo.andela.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ikem.nwodo.andela.CoreFragment;
import com.ikem.nwodo.andela.JavaScriptFragment;
import com.ikem.nwodo.andela.PythonFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;
    public PagerAdapter(FragmentManager fm, int NumOfTabs){
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new CoreFragment();
            case 1:
                return new JavaScriptFragment();
            case 2:
                return new PythonFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
