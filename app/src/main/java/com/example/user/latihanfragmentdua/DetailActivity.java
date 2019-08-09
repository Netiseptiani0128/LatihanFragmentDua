package com.example.user.latihanfragmentdua;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class DetailActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    Pegawai pegawaiDetail;
    TabFragmentPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tabLayout=(TabLayout)findViewById(R.id.tab_layout);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        Intent intent = getIntent();
        pegawaiDetail=(Pegawai)intent.getSerializableExtra("pegawainya");
        pagerAdapter=new TabFragmentPagerAdapter(getSupportFragmentManager(),pegawaiDetail);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setTabTextColors(getResources().getColor(R.color.colorBlue),getResources().getColor(R.color.colorWhite));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}
