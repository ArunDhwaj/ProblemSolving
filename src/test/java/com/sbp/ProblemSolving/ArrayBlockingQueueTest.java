package com.sbp.ProblemSolving;

import com.sbp.ProblemSolving.cocurrent.ArrayBlockingQueueExample;
import org.junit.jupiter.api.Test;

public class ArrayBlockingQueueTest
{
    private ArrayBlockingQueueExample ab;

    @Test
    public void testCase1() throws InterruptedException
    {
        ab = new ArrayBlockingQueueExample();
        ab.Example();
    }
}
