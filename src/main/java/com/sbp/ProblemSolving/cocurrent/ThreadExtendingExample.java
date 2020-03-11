package com.sbp.ProblemSolving.cocurrent;

public class ThreadExtendingExample extends Thread
{
    public ThreadExtendingExample()
    {
        super("testing extended class");
        System.out.println("extend crated" + this);
        start();
    }

    public void run()
    {
        try
        {
            for (int i=0 ;i<9;i++)
            {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("thread error interrupted");
        }
        System.out.println("thread run is over" );
    }

    public void checkingThread()
    {
        ThreadExtendingExample threadExtendingExample = new ThreadExtendingExample();

        try
        {
            while(threadExtendingExample.isAlive())
            {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over" );
    }
}
