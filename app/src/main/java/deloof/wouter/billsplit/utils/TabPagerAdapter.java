package deloof.wouter.billsplit.utils;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import deloof.wouter.billsplit.fragments.AboutFragment;
import deloof.wouter.billsplit.fragments.SplitFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {

    private Fragment[] fragments = {SplitFragment.newInstance(), AboutFragment.newInstance()};

    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "Split";
            case 1: return "About";
            default: return "";
        }
    }
}
