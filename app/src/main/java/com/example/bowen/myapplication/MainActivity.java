package com.example.bowen.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends BaseActivity {
    private Button btn;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        btn=(Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this,MySkinActivity.class);
            startActivity(intent);
			}
		});
    }
    //每个页面都要重写这个方法和初始化皮肤的方法
    @Override
    protected void onResume() {
    	//初始化皮肤
    	super.onResume();
    }
}
