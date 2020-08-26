package com.sbp.ProblemSolving.multithreading;

public class OddEvenRunnable implements Runnable
{
    static Object myLock = new Object();
    static private int number = 1;
    static private int cycle = 1;

    private int max_number=20;
    private int remainder;

    public OddEvenRunnable( int remainder )
    {
        this.remainder = remainder;
    }

    @Override
    public void run()
    {
        while ( number < max_number)
        {
                System.out.println(Thread.currentThread().getName());

                synchronized (myLock)
                {
                    while ( number % 2 != remainder)
                    {
                    // wait for numbers other than remainder
                        try
                        {
                            myLock.wait();
                        }
                        catch (InterruptedException e)
                        {
                            e.printStackTrace();
                        }
                    }

                    if(cycle%2 == 1 )
                    {
                        if (remainder == 1)
                        {
                            System.out.println("cycle: " + cycle);
                            System.out.println(Thread.currentThread().getName() + " " + (2*cycle -1));
                        }
                        else if (remainder == 0)
                        {
                            System.out.println(Thread.currentThread().getName() + " " + (2*cycle));
                            System.out.println();
                            cycle++;
                        }
                    }

                    else if(cycle%2 == 0 )
                    {
                        if (remainder == 1)
                        {
                            System.out.println("cycle: " + cycle);

                            System.out.println(Thread.currentThread().getName() + " " + (2*cycle));
                            //System.out.println();
                        }
                        else if (remainder == 0)
                        {
                            System.out.println(Thread.currentThread().getName() + " " + (2*cycle-1));
                            System.out.println();
                            cycle++;
                        }
                    }

                    number++;
                    myLock.notifyAll();
                }
        }
    }
}
