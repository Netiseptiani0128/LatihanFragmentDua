package com.example.user.latihanfragmentdua;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    String[]judul=new String[]{"personal","job","skill"};
    Pegawai xxx;
    public TabFragmentPagerAdapter(FragmentManager fm,Pegawai xxxx) {
        super(fm);
        this.xxx=xxxx;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                Fragment fragmentPersonal=new FragmentPersonal();
                Bundle bungkus=new Bundle();
                bungkus.putSerializable("bungkus1",xxx);
                fragmentPersonal.setArguments(bungkus);
                return fragmentPersonal;
            case 1:
                Fragment fragmentJob=new FragmentJob();
                Bundle bungkus2=new Bundle();
                bungkus2.putSerializable("bungkus2",xxx);
                fragmentJob.setArguments(bungkus2);
                return fragmentJob;
            case 2:
                Fragment fragmentSkill=new FragmentSkill();
                Bundle bungkus3=new Bundle();
                bungkus3.putSerializable("bungkus3",xxx);
                fragmentSkill.setArguments(bungkus3);
                return fragmentSkill;
        }
        return null;
    }

    @Override
    public int getCount(){ return judul.length;}

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){return judul[position];}
}
