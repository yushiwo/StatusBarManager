package zr.com.statusbarmanager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zr.com.statusbarmanager.R;


public class MyFragment1 extends Fragment {

    public static MyFragment1 newInstance() {
        MyFragment1 fragment = new MyFragment1();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pager_1, null);
        return view;
    }

}
