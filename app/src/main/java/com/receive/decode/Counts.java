package com.receive.decode;

import android.app.Application;

public class Counts extends Application {
    private static Counts instance = null;
    private int count =0;//自己定义的变量，下面生成了其get和set方法
    private int countz =0;
    public static synchronized Counts getInstance()

    {

        if(null == instance){

            instance = new Counts();
        }
        return instance;
    }
    public void onCreate()
    {
        super.onCreate();
        instance = this;
    }
    public void setCount(int a)
    {
        this.count=a;
    }
    public int getCount()
    {
        return  count;
    }

    public void setCountz(int b)
    {
        this.countz=b;
    }
    public int getCountz(){return countz;}
}
