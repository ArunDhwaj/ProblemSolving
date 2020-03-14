package com.sbp.ProblemSolving.multithreading;

public class MyRunnable implements Runnable
{
    static Object my_lock = new Object();
    static int max = 15;
    static int  start_num = 1;

    int remainder;


    public MyRunnable(int remainder)
    {
        this.remainder=remainder;
    }

    @Override
    public void run()
    {
        while (start_num < max)
        {
            synchronized (my_lock)
            {
                while (start_num % 3 != remainder)
                {
                    // wait for numbers other than remainder
                    try
                    {
                        my_lock.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName() + " " + start_num);
                start_num ++;
                my_lock.notifyAll();
            }
        }
    }
}
