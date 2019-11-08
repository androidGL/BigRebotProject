package com.pcare.inquiry.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.pcare.common.base.BaseActivity;
import com.pcare.common.base.IPresenter;
import com.pcare.inquiry.R;

@Route(path = "/inquiry/main")
public class MainActivity extends BaseActivity {
    @Autowired
    public String key1;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main_inquiry;

    }

    public void startRequest(View view) {
        Intent intent = new Intent(this, SpeakActivity.class);
        if (view.getId() == R.id.request_type_select) {
            intent.putExtra("type", "select");
        } else {
            intent.putExtra("type", "speak");
        }
        startActivity(intent);
        finish();
    }

    @Override
    public void start() {
        super.start();
        Toast.makeText(this, "收到传送过来的数据：" + key1, Toast.LENGTH_LONG).show();
    }

    @Override
    protected IPresenter bindPresenter() {
        return null;
    }
}
