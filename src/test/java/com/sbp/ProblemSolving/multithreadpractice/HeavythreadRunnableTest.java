package com.sbp.ProblemSolving.multithreadpractice;

import com.sbp.ProblemSolving.multithreadpractise.HeavyWorkRunnable;
import org.junit.jupiter.api.Test;

public class HeavythreadRunnableTest
{
    @Test

    public void HeavythreadRunnable()
    {
        Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
        System.out.println("Starting Runnable threads");
        t1.start();
        t2.start();
        System.out.println("Runnable Threads has been started");
        System.out.println("Starting MyThreads");
        System.out.println("MyThreads has been started");
    }

}
