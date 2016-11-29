package com.bwie.test.startmode.com.bwie.test.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bwie.test.startmode.R;

/**
 * 1.作用
 * 2.作者
 * 3.日期
 */
public class Fragment1 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_item, container, false);
        TextView tv=(TextView) view.findViewById(R.id.tv_name);
        Bundle bundle=getArguments();//从activity传过来的Bundle
        if(bundle!=null){
            tv.setText(bundle.getString("str"));
        }
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
}
