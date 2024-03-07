package com.example.livemeeting;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new NewMeeting();
            case 1:
                return new Join();
            case 2:
                return new Schedule();
            case 3:
                return new ShareScreen();
            default:
                return new NewMeeting();
        }

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
