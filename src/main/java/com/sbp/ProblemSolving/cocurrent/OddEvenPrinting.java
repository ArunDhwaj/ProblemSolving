package com.sbp.ProblemSolving.cocurrent;

public class OddEvenPrinting
{
    boolean odd;

    private int count = 1;
    private int MAX = 20;

    public OddEvenPrinting( int num)
    {
        this.MAX = num;
    }

    public void printOdd( )
    {
        synchronized (this)
        {
            while (count <= MAX)
            {
                while (!odd)
                {
                    try
                    {
                        //System.out.println("Odd waiting : " + count);
                        wait();
                        //System.out.println("Notified odd :" + count);
                    }
                    catch (InterruptedException e)
                    {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

                System.out.println("Odd Number :" + count);
                count++;
                odd = false;
                notify();
            }
        }
    }

    public void printEven()
    {
        synchronized (this)
        {
            while (count <= MAX)
            {
                while (odd)
                {
                    try
                    {
                        //System.out.println("Even waiting: " + count);
                        wait();
                        //System.out.println("Notified even:" + count);
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }

                System.out.println("Even Number :" + count);
                count++;
                odd = true;
                notify();
            }
        }
    }
}

