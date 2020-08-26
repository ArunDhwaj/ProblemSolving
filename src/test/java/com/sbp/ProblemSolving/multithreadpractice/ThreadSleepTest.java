package com.sbp.ProblemSolving.multithreadpractice;

import com.sbp.ProblemSolving.multithreading.OddEvenRunnable;
import com.sbp.ProblemSolving.multithreadpractise.HeavyWorkRunnable;
import com.sbp.ProblemSolving.multithreadpractise.ThreadSleep;
import org.junit.jupiter.api.Test;

public class ThreadSleepTest
{
    @Test
    public void testCases() throws Exception
    {
       ThreadSleep threadSleep = new ThreadSleep();
        threadSleep.start();
    }
}
