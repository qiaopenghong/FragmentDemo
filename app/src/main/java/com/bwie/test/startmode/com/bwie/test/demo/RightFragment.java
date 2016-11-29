package com.bwie.test.startmode.com.bwie.test.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bwie.test.startmode.R;

/**
 * 1.作用 Fragment传值到Fragment
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/29
 */
public class RightFragment extends Fragment{
    FragmentManager manager;
    FragmentTransaction transaction;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_right, null);
        //使用当前Activity的getApplication()方法得到一个MyApp对象
        MyApp myApp = (MyApp)getActivity().getApplication();
        //得到传来的值
        String name = myApp.getName();
        TextView tv=(TextView)view.findViewById(R.id.rightTv);
        tv.setText("右边"+name);
        manager = getActivity().getSupportFragmentManager();
        transaction = manager.beginTransaction();
        transaction.add(R.id.fl,new LeftFragment());
        transaction.commit();
        LeftFragment lf=new LeftFragment();
        Bundle bundle=new Bundle();
        bundle.putString("name",name);
        lf.setArguments(bundle);
        transaction=manager.beginTransaction();
        transaction.replace(R.id.fl,lf);
        transaction.commit();
        return view;
    }


}
