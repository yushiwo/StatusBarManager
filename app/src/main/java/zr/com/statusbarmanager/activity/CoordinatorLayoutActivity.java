package zr.com.statusbarmanager.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zr.library.StatusBarManager;

import zr.com.statusbarmanager.R;


public class CoordinatorLayoutActivity extends AppCompatActivity {

    public static void launch(Context context) {
        Intent intent = new Intent(context, CoordinatorLayoutActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);

        StatusBarManager.getsInstance().setColorForCoordinatorLayout(CoordinatorLayoutActivity.this, Color.TRANSPARENT);

    }
}
