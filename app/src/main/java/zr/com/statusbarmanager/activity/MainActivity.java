package zr.com.statusbarmanager.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zr.library.StatusBarManager;

import zr.com.statusbarmanager.R;
import zr.com.statusbarmanager.base.BaseActivity;


public class MainActivity extends BaseActivity implements View.OnClickListener {

    private Button mNormalButton, mDrawerLayoutButton, mRedButton, mBlueButton, mTransparentButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        setListener();
    }

    private void initView() {
        mNormalButton = (Button) findViewById(R.id.btn_normal);
        mDrawerLayoutButton = (Button) findViewById(R.id.btn_drawer_layout);
        mRedButton = (Button) findViewById(R.id.btn_red);
        mBlueButton = (Button) findViewById(R.id.btn_blue);
        mTransparentButton = (Button) findViewById(R.id.btn_transparent);
    }

    private void setListener() {
        mNormalButton.setOnClickListener(this);
        mDrawerLayoutButton.setOnClickListener(this);
        mRedButton.setOnClickListener(this);
        mBlueButton.setOnClickListener(this);
        mTransparentButton.setOnClickListener(this);
    }

    @Override
    protected void initStatusBar() {
        StatusBarManager.getsInstance().setColor(MainActivity.this, Color.BLUE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_normal:
                NormalActivity.launch(MainActivity.this);
                break;

            case R.id.btn_drawer_layout:
                DrawerLayoutActivity.launch(MainActivity.this);
                break;

            case R.id.btn_red:
                StatusBarManager.getsInstance().setColor(MainActivity.this, Color.RED);
                break;

            case R.id.btn_blue:
                StatusBarManager.getsInstance().setColor(MainActivity.this, Color.BLUE);
                break;

            case R.id.btn_transparent:
                StatusBarManager.getsInstance().setColor(MainActivity.this, Color.TRANSPARENT);
                break;
        }
    }
}
