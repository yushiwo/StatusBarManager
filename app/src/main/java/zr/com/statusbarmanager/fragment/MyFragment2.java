package zr.com.statusbarmanager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import zr.com.statusbarmanager.R;


public class MyFragment2 extends Fragment {

    public static MyFragment2 newInstance() {
        MyFragment2 fragment = new MyFragment2();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pager_2, null);
        return view;
    }

}
