package com.sbp.ProblemSolving;

import com.sbp.ProblemSolving.multithreading.MyRunnable;
import org.junit.jupiter.api.Test;

public class MyThreadTest
{


    @Test
    public void testCases()
    {
        MyRunnable runnable1=new MyRunnable(1);
        MyRunnable runnable2=new MyRunnable(2);
        MyRunnable runnable3=new MyRunnable(0);

        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
        Thread t3=new Thread(runnable3,"T3");

        t1.start();
        t2.start();
        t3.start();
    }
}

