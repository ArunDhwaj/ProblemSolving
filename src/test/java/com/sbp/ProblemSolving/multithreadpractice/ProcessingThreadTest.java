package com.sbp.ProblemSolving.multithreadpractice;

import com.sbp.ProblemSolving.multithreadpractise.ProcessingThread;
import org.junit.jupiter.api.Test;

public class ProcessingThreadTest
{
    @Test
    public void test() throws InterruptedException
    {
        ProcessingThread pt = new ProcessingThread();
        Thread t1 = new Thread(pt, "t1");
        t1.start();
        Thread t2 = new Thread(pt, "t2");
        t2.start();
        //wait for threads to finish processing
        t1.join();
        t2.join();
        System.out.println("Processing count=" +pt.getCount());
    }
}
