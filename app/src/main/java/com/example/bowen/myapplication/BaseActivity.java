package com.example.bowen.myapplication;

import android.app.Activity;
import android.widget.LinearLayout;

/**
 * Created by bowen on 2017/6/16.
 */

public class BaseActivity extends Activity {

    private SkinSettingManager mSettingManager;
    private LinearLayout layout;
    private int layouts=R.id.activity_diyi;
    @Override
    protected void onResume() {
        super.onResume();

        //初始化皮肤
        layout=(LinearLayout) findViewById(layouts);
        mSettingManager=new SkinSettingManager(this,layout);
        mSettingManager.initSkins();
    }
}
