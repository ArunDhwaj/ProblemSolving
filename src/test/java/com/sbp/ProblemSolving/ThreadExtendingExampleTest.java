package com.sbp.ProblemSolving;

import com.sbp.ProblemSolving.cocurrent.ThreadExtendingExample;
import org.junit.jupiter.api.Test;

public class ThreadExtendingExampleTest
{
    private ThreadExtendingExample threadExtendingExample;

    @Test
    public void ThreadExtendingExampleTest()
    {
        threadExtendingExample = new ThreadExtendingExample();
        threadExtendingExample.checkingThread();
    }
}
