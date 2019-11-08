package com.pcare.common.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.ButterKnife;

public abstract class BaseActivity<P extends IPresenter> extends Activity implements IView{
    protected P presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(getLayoutId());
        ARouter.getInstance().inject(this);
        ButterKnife.bind(this);
        presenter = bindPresenter();
        start();
    }
    public abstract int getLayoutId();
    // 绑定Presenter
    protected abstract P bindPresenter();

    //开始了
    public void start(){

    }


    @Override
    public Activity getSelfActivity() {
        return this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter != null)
            presenter.detachView();
    }

}
