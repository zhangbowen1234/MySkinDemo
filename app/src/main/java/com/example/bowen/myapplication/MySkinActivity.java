package com.example.bowen.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MySkinActivity extends Activity implements OnClickListener{
	private SkinSettingManager mSettingManager;
	private ImageView iv1,iv2,iv3,iv4,iv5,iv6;
	Button btn_quxiao;
       @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.myskin);
        init();
        btn_quxiao = (Button) findViewById(R.id.btn_quxiao);
        btn_quxiao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MySkinActivity.this,SecondActivity.class);
	            startActivity(intent);
	            finish();
			}
		});
       }
	private void init() {
		//初始化皮肤
		mSettingManager=new SkinSettingManager(this);
		mSettingManager.initSkins();
		
		iv1=(ImageView) findViewById(R.id.imageView1);
		iv1.setOnClickListener(MySkinActivity.this);
		
		iv2=(ImageView) findViewById(R.id.imageView2);
		iv2.setOnClickListener(MySkinActivity.this);
		iv3=(ImageView) findViewById(R.id.imageView3);
		iv3.setOnClickListener(MySkinActivity.this);
		iv4=(ImageView) findViewById(R.id.imageView4);
		iv4.setOnClickListener(MySkinActivity.this);
		iv5=(ImageView) findViewById(R.id.imageView5);
		iv5.setOnClickListener(MySkinActivity.this);
		iv6=(ImageView) findViewById(R.id.imageView6);
		iv6.setOnClickListener(MySkinActivity.this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.imageView1:
			mSettingManager.toggleSkins(0);
			break;
		case R.id.imageView2:
			mSettingManager.toggleSkins(1);
			break;
		case R.id.imageView3:
			mSettingManager.toggleSkins(2);
			break;
		case R.id.imageView4:
			mSettingManager.toggleSkins(3);
			break;
		case R.id.imageView5:
			mSettingManager.toggleSkins(4);
			break;
		case R.id.imageView6:
			mSettingManager.toggleSkins(5);
			break;
		}
	}
}
