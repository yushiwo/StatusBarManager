package zr.com.statusbarmanager.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zr.library.StatusBarManager;

import zr.com.statusbarmanager.R;
import zr.com.statusbarmanager.base.BaseActivity;


public class NormalActivity extends BaseActivity implements View.OnClickListener {

    private Button mRedButton, mBlueButton, mTransparentButton;


    public static void launch(Context context) {
        Intent intent = new Intent(context, NormalActivity.class);
        context.startActivity(intent);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        initView();

        setListener();
    }

    private void initView() {
        mRedButton = (Button) findViewById(R.id.btn_red);
        mBlueButton = (Button) findViewById(R.id.btn_blue);
        mTransparentButton = (Button) findViewById(R.id.btn_transparent);
    }

    private void setListener() {
        mRedButton.setOnClickListener(this);
        mBlueButton.setOnClickListener(this);
        mTransparentButton.setOnClickListener(this);
    }

    @Override
    protected void initStatusBar() {
        StatusBarManager.getsInstance().setColor(NormalActivity.this, Color.BLUE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_red:
                StatusBarManager.getsInstance().setColor(NormalActivity.this, Color.RED);
                break;

            case R.id.btn_blue:
                StatusBarManager.getsInstance().setColor(NormalActivity.this, Color.BLUE);
                break;

            case R.id.btn_transparent:
                StatusBarManager.getsInstance().setColor(NormalActivity.this, Color.TRANSPARENT);
                break;
        }
    }
}
