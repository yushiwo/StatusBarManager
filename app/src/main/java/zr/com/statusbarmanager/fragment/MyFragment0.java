package zr.com.statusbarmanager.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import zr.com.statusbarmanager.R;


public class MyFragment0 extends Fragment {

    public static MyFragment0 newInstance() {
        MyFragment0 fragment = new MyFragment0();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pager_0, null);
        return view;
    }

}
