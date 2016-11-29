package com.bwie.test.startmode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
/**
 * autour: 乔鹏宏
 * date: 2016/11/29 21:14 
 * update: 2016/11/29
 */

//Fragment与Activity的生命周期
public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_LEFT_ICON);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("HJJ", "Activity &&&& onCreate...");
        // Create the list fragment and add it as our sole content.
            if (getFragmentManager().findFragmentById(android.R.id.content) == null) {
            ArrayListFragment list = new ArrayListFragment();
            getFragmentManager().beginTransaction().add(android.R.id.content,list).commit();
        }
    }
    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.e("HJJ", "Activity &&&& onStart...");
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.e("HJJ", "Activity &&&& onResume...");
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Log.e("HJJ", "Activity &&&& onStop...");
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        Log.e("HJJ", "Activity &&&& onPause...");
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.e("HJJ", "Activity &&&& onDestroy...");
    }

}
