package com.sbp.ProblemSolving.multithreadpractise;

public class HeavyWorkRunnable implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Heavy Processing Start" +Thread.currentThread().getName());

        try
        {
            Thread.sleep(1000);
            //Get database connection, delete unused data from DB
            doDBProcessing();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Heavy processing END " + Thread.currentThread().getName());
    }

    private void doDBProcessing() throws InterruptedException
    {
        Thread.sleep(5000);
    }
}
