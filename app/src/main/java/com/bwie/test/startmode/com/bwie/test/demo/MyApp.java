package com.bwie.test.startmode.com.bwie.test.demo;

import android.app.Application;

/**
 * 1.作用：通过Application进行传值
 * 2.作者 乔鹏宏
 * 3.日期 2016/11/29
 */
public class MyApp extends Application{
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public MyApp(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public MyApp() {
        super();
    }
}
