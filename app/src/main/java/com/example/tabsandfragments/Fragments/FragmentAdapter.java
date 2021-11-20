package com.example.tabsandfragments.Fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

//--------------------Deprecated----------------------
public class FragmentAdapter extends FragmentPagerAdapter {

    int tabCount = 0;

    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {

        super(fm, behavior);
        tabCount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0 : return new FragmentChat();
            case 1 : return new FragmentStatus();
            case 2 : return new FragmentCalls();

            default: return  new FragmentChat();
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";

        switch (position){
            case 0: title = "CHATS"; break;
            case 1: title = "STATUS"; break;
            case 2: title = "CALLS"; break;

            default: title = "Not Specified"; break;
        }
        return title;
    }
}