package zr.com.statusbarmanager.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zr.library.StatusBarManager;

import java.util.ArrayList;
import java.util.List;

import zr.com.statusbarmanager.R;
import zr.com.statusbarmanager.fragment.MyFragment0;
import zr.com.statusbarmanager.fragment.MyFragment1;
import zr.com.statusbarmanager.fragment.MyFragment2;
import zr.com.statusbarmanager.fragment.MyFragmentPageAdapter;
import zr.com.statusbarmanager.util.ColorUtil;

public class ViewpagerActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private MyFragmentPageAdapter mAdapter;

    public static void launch(Context context) {
        Intent intent = new Intent(context, ViewpagerActivity.class);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(MyFragment0.newInstance());
        fragments.add(MyFragment1.newInstance());
        fragments.add(MyFragment2.newInstance());
        //初始化自定义适配器
        mAdapter =  new MyFragmentPageAdapter(getSupportFragmentManager(), fragments);
        mViewPager.setOffscreenPageLimit(2);
        //绑定自定义适配器
        mViewPager.setAdapter(mAdapter);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                StatusBarManager.getsInstance().setColor(ViewpagerActivity.this, getStatusBarColor(position));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    public @ColorInt int getStatusBarColor(int index) {
        int color = Color.TRANSPARENT;
        switch (index) {
            case 0:
                color = getResources().getColor(R.color.color0);
                break;

            case 1:
                color = getResources().getColor(R.color.color1);
                break;

            case 2:
                color = getResources().getColor(R.color.color2);
                break;
        }

        return color;
    }
}
