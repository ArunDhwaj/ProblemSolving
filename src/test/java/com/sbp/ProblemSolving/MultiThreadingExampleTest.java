package com.sbp.ProblemSolving;

import com.sbp.ProblemSolving.cocurrent.MultiThreadingExample;
import org.junit.jupiter.api.Test;

public class MultiThreadingExampleTest
{
    private MultiThreadingExample multiThreadingExample;

    @Test
    public void MultiThreadingExampleTest()
    {
        multiThreadingExample = new MultiThreadingExample();
        multiThreadingExample.run();
    }

}
