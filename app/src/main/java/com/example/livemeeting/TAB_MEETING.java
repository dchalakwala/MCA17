package com.example.livemeeting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class TAB_MEETING extends AppCompatActivity {

    TabLayout tabLayout;
//    TabItem newmeeting,join,schedule,sharescreen;
    ViewPager2 viewPager2;
    MyViewPagerAdapter myViewPagerAdapter;
    private JOINMEETING MyViewPagerAdapter;


    BottomNavigationView bottomNavigationView;
    Meeting1 meeting1=new Meeting1();
    TeamChat teamchat=new TeamChat();
    mail Mail=new mail();
    Calander calander=new Calander();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_meeting);

        tabLayout=findViewById(R.id.tab1);
        viewPager2=findViewById(R.id.view1);
        myViewPagerAdapter=new MyViewPagerAdapter(this);
        viewPager2.setAdapter(myViewPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });

        bottomNavigationView=findViewById(R.id.nav1);
        getSupportFragmentManager().beginTransaction().replace(R.id.f1,meeting1).commit();
        BadgeDrawable badgeDrawable=bottomNavigationView.getOrCreateBadge(R.id.chat);
        badgeDrawable.setVisible(true);
        badgeDrawable.setVisible(Boolean.parseBoolean("six"));

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.meeting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.f1,meeting1).commit();
                        return true;
                    case R.id.chat:
                        getSupportFragmentManager().beginTransaction().replace(R.id.f1,teamchat).commit();
                        return true;
                    case R.id.mail:
                        getSupportFragmentManager().beginTransaction().replace(R.id.f1,Mail).commit();
                        return true;
                    case R.id.cal:
                        getSupportFragmentManager().beginTransaction().replace(R.id.f1,calander).commit();
                        return true;

                }
                return false;
            }
        });
    }
}