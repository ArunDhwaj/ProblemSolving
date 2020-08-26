package com.sbp.ProblemSolving;

import com.sbp.ProblemSolving.multithreading.AleternateSeqBy4Thread;
import com.sbp.ProblemSolving.multithreading.SequenceInCycleRunnable;
import org.junit.jupiter.api.Test;

public class AleternateSeqBy4ThreadTest
{
    @Test
    public void testCase1()
    {
        AleternateSeqBy4Thread runnable1 = new AleternateSeqBy4Thread(1);
        AleternateSeqBy4Thread runnable2 = new AleternateSeqBy4Thread(2);
        AleternateSeqBy4Thread runnable3 = new AleternateSeqBy4Thread(3);
        AleternateSeqBy4Thread runnable4 = new AleternateSeqBy4Thread(0);

        Thread t1 = new Thread(runnable1,"T1");
        Thread t2 = new Thread(runnable2,"T2");
        Thread t3 = new Thread(runnable3,"T3");
        Thread t4 = new Thread(runnable3,"T4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
