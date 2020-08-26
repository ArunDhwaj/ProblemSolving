package com.sbp.ProblemSolving.multithreadpractise;

public class ThreadJoin implements Runnable
{

    @Override
    public void run()
    {
        System.out.println("Thread started:::"+Thread.currentThread().getName());
        try
        {
            Thread.sleep(4000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Thread ended:::"+Thread.currentThread().getName());
    }
}
