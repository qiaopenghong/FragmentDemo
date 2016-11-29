package com.bwie.test.startmode.com.bwie.test.demo;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.bwie.test.startmode.R;
/**
 * autour: 乔鹏宏
 * date: 2016/11/29 21:10
 * update: 2016/11/29
 */
//通过全局进行传值
public class ThreeActivity extends AppCompatActivity {
    FragmentManager manager;
    FragmentTransaction transaction;
    EditText nameEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        nameEt = (EditText)findViewById(R.id.nameEt);
        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.add(R.id.rightLayout, new RightFragment());
        transaction.commit();
    }
    @SuppressLint("NewApi")
    public void change(View v){
        String name = nameEt.getText().toString();
        if (name!=null) {
            //使用getApplication()方法得到一个MyApp对象
            MyApp myApp = (MyApp) getApplication();
            //设置名字
            myApp.setName(name);
            manager.beginTransaction().
                    replace(R.id.rightLayout, new RightFragment()).commit();
        }else{
            Toast.makeText(ThreeActivity.this, "请输入名字",Toast.LENGTH_SHORT).show();
        }
    }
}
