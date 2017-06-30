package zr.com.statusbarmanager.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 自定义fragment适配器
 *
 * @author ZHF
 */
public class MyFragmentPageAdapter extends FragmentPagerAdapter {
    List<Fragment> fragments;

    public MyFragmentPageAdapter(FragmentManager fm,  List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
}
