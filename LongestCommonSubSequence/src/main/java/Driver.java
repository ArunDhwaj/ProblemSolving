package main.java;

import java.util.*;

class Driver
{
    // main function
    public static void main(String[] args)
    {
        String X = "XMJYAUZ", Y = "MZJAWXU";

        //String X = "ABCDGH", Y = "AEDFHR";
        //String X = "AGGTAB", Y = "GXTXAYB";

        LongestCommonSubSeq lcss = new LongestCommonSubSeq(X, Y);

        lcss.LCSLength();
        lcss.LCSCharacters();
    }
}
