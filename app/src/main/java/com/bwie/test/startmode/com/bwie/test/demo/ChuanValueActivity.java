package com.bwie.test.startmode.com.bwie.test.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bwie.test.startmode.R;

public class ChuanValueActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText et;
    private String str;
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private Button bt;
    private Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chuan_value);
        et = (EditText) findViewById(R.id.et);
        bt = (Button) findViewById(R.id.bt);
        bt2 = (Button) findViewById(R.id.bt2);
        bt.setOnClickListener(this);
        bt2.setOnClickListener(this);
        fragmentManager = getSupportFragmentManager();
        transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.contents,new Fragment1());
        transaction.commit();

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt:
                Fragment1 fragment1 = new Fragment1();
                Bundle bundle = new Bundle();
                str=et.getText().toString().trim();
                bundle.putString("str",str);
                fragment1.setArguments(bundle);
                transaction=fragmentManager.beginTransaction();
                transaction.replace(R.id.contents,fragment1);
                transaction.commit();
                break;
            case R.id.bt2:
                //点击跳转跳转到ThreeAcitivity
                startActivity(new Intent(ChuanValueActivity.this,ThreeActivity.class));
                break;
            default:
                break;
        }
    }
}
