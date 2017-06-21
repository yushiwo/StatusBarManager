package zr.com.statusbarmanager.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import zr.com.statusbarmanager.R;
import zr.com.statusbarmanager.base.BaseActivity;


public class NormalActivity extends BaseActivity {


    public static void launch(Context context) {
        Intent intent = new Intent(context, NormalActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
    }
}
