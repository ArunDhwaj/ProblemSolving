package com.sbp.ProblemSolving;

import com.sbp.ProblemSolving.multithreading.SequenceInCycleRunnable;
import org.junit.jupiter.api.Test;

public class SequenceInCycleRunnableTest
{
    @Test
    public void testCase1()
    {
        SequenceInCycleRunnable runnable1 = new SequenceInCycleRunnable(1);
        SequenceInCycleRunnable runnable2 = new SequenceInCycleRunnable(2);
        SequenceInCycleRunnable runnable3 = new SequenceInCycleRunnable(0);

        Thread t1=new Thread(runnable1,"T1");
        Thread t2=new Thread(runnable2,"T2");
        Thread t3=new Thread(runnable3,"T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
