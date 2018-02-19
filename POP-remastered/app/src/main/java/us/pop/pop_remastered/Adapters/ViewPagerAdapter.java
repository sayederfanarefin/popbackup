package us.pop.pop_remastered.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import us.poptalks.fragment.ChatFragment;
import us.poptalks.fragment.FriendFragment;
import us.poptalks.fragment.HistoryFragment;
import us.poptalks.fragment.InfoFragment;


/**
 * Created by piashsarker on 7/10/17.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FriendFragment();
        } else if (position == 1) {
            return new ChatFragment();
        } else if (position == 2) {
            return new HistoryFragment();
        } else {
            return new InfoFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}