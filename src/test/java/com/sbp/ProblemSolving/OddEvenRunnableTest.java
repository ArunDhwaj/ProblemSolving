package com.sbp.ProblemSolving;

import com.sbp.ProblemSolving.multithreading.OddEvenRunnable;
import org.junit.jupiter.api.Test;

public class OddEvenRunnableTest
{
    @Test
    public void testCases1()
    {
        OddEvenRunnable oddRunnable = new OddEvenRunnable(1);
        OddEvenRunnable evenRunnable = new OddEvenRunnable(0);

        Thread t1 = new Thread(oddRunnable, "Thead-1");
        Thread t2 = new Thread(evenRunnable, "Thred-2");

        t1.start();
        t2.start();
    }
}
