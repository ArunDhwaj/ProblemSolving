package com.sbp.ProblemSolving.multithreading;

public class AleternateSeqBy4Thread implements Runnable
{
    static int number = 1;
    static int cycle = 1;
    static Object my_lock_sicr = new Object();

    static int max = 16;
    int remainder;

    public AleternateSeqBy4Thread(int remainder)
    {
        this.remainder = remainder;
    }

    @Override
    public void run()
    {
        while (number < max)
        {
            synchronized (my_lock_sicr)
            {
                while (number % 3 != remainder)
                {
                    // wait for numbers other than remainder
                    try
                    {
                        my_lock_sicr.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

                if (cycle % 2 == 1)
                {
                    if (remainder == 1)
                    {
                        System.out.println("cycle: " + cycle);
                        System.out.println(Thread.currentThread().getName() + " " + (3 * cycle - 2));
                    }
                    else if (remainder == 2)
                    {
                        System.out.println(Thread.currentThread().getName() + " " + (3 * cycle - 1));
                    }
                    else if (remainder == 0)
                    {
                        System.out.println(Thread.currentThread().getName() + " " + (3 * cycle));
                        System.out.println();
                        cycle++;
                    }
                }
                else if (cycle % 2 == 0)
                {
                    if (remainder == 1)
                    {
                        System.out.println("cycle: " + cycle);
                        System.out.println(Thread.currentThread().getName() + " " + (3 * cycle));
                    }
                    else if (remainder == 2)
                    {
                        System.out.println(Thread.currentThread().getName() + " " + (3 * cycle - 1));
                    }
                    else if (remainder == 0)
                    {
                        System.out.println(Thread.currentThread().getName() + " " + (3 * cycle - 2));
                        System.out.println();
                        cycle++;
                    }
                }

                number++;
                my_lock_sicr.notifyAll();
            }
        }
    }
}


