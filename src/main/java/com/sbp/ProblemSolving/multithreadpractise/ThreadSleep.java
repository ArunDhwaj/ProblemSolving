package com.sbp.ProblemSolving.multithreadpractise;

public class ThreadSleep
{
    public ThreadSleep() throws Exception
    {
        long start = System.currentTimeMillis();
        Thread.sleep(20000);
        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
    }

    public void start()
    {
    }
}
