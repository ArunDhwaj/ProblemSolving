package com.sbp.ProblemSolving.cocurrent;

public class MultiThreadingExample extends Thread
{
    public void run()
    {
        System.out.println("This is my extend thread class");
    }

    public MultiThreadingExample()
    {
        MultiThreadingExample multiThreadingExample = new MultiThreadingExample();
        multiThreadingExample.run();
    }
}
