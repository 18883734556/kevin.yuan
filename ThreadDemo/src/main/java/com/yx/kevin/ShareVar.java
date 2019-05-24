package com.yx.kevin;

public class ShareVar {
    private int count;
    public void add(){
        try {
            Thread.sleep(3000);//此处为了更好的体现多线程的安全问题
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
    }

    public void sub(){
        count--;
    }

    public int getCount(){
        return count;
    }
}
