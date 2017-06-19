package com.example.bowen.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class FirstActivity extends BaseActivity {
	Button btn1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		btn1 = (Button) findViewById(R.id.shezhi_btn);
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(FirstActivity.this,MainActivity.class);
	            startActivity(intent);
			}
		});
	}
	 //每个页面都要重写这个方法和初始化皮肤的方法
    @Override
    protected void onResume() {

    	super.onResume();
    }

}
