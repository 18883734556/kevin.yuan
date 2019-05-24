package com.yx;

import com.yx.kevin.AddThread;
import com.yx.kevin.ShareVar;
import com.yx.kevin.SubThread;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        ShareVar ins = new ShareVar();
        List<Thread> treadList = new ArrayList<>();
        for (int i = 0; i < 10 ; i++) {
            Thread thread;
            if(i%2==0){
                thread = new Thread(new AddThread(ins));
                System.out.println("第"+String.valueOf(i)+"个线程："+Thread.currentThread().getId()+
                       "数量："+ ins.getCount());
            }else {
                thread = new Thread(new SubThread(ins));
                System.out.println("第"+String.valueOf(i)+"个线程："+Thread.currentThread().getId()+
                        "数量："+ ins.getCount());
            }
            thread.start();
            treadList.add(thread);
        }

        for (Thread thread:treadList) {
            thread.join();
        }
        System.out.println("线程id:"+Thread.currentThread().getId()+"; 线程name:"+
                Thread.currentThread().getName()+"; 数量count:"+ ins.getCount());
    }
}
