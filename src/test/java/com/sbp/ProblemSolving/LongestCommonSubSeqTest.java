package com.sbp.ProblemSolving;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LongestCommonSubSeqTest
{
    private LongestCommonSubSeq lcs1, lcs2, lcs3;

    //@Disabled
    @Test
    public void testCase1()
    {
        String X = "XMJYAUZ", Y = "MZJAWXU";

        lcs1 = new LongestCommonSubSeq(X, Y);
        lcs1.LCSLength();
    }

    //@Disabled
    @Test
    public void testCase2()
    {
        String X = "ABCDGH", Y = "AEDFHR";

        lcs2 = new LongestCommonSubSeq(X, Y);
        lcs2.LCSLength();
    }

    //@Disabled
    @Test
    public void testCase3()
    {
        String X = "AGGTAB", Y = "GXTXAYB";

        lcs3 = new LongestCommonSubSeq(X, Y);
        lcs3.LCSLength();
    }
}
