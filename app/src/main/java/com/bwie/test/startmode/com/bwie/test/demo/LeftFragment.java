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
 * 1.作用 接收从RightFragment传过来的值
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/29
 */
public class LeftFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_left, container, false);
        TextView tv_sname = (TextView) view.findViewById(R.id.tv_sname);
        Bundle bundle = getArguments();
        if(bundle!=null){
            String sname = bundle.getString("name");
            tv_sname.setText("左边"+sname);
        }
        return view;
    }
}
