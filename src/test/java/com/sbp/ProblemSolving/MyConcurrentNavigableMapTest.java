package com.sbp.ProblemSolving;

import com.sbp.ProblemSolving.javarnd.MyConcurrentNavigableMap;
import org.junit.jupiter.api.Test;

public class MyConcurrentNavigableMapTest
{
    private MyConcurrentNavigableMap myConNavapp;

    @Test
    public void concurrentMapTest()
    {
        myConNavapp = new MyConcurrentNavigableMap();
        myConNavapp.concurrentMap();
    }
}
