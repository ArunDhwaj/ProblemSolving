package com.sbp.ProblemSolving;

public class LongestCommonSubSeq
{

    private String X;
    private String Y;

    // Max, length of the common subSequence;
    private int max_length;

    // Max. index in 1st Sequence;
    private int max_index1;

    // Max. index in 2nd Sequence;
    private int max_index2;

    //Stores the common sub sequence
    private StringBuffer commonSubSeq = new StringBuffer();

    // Lookup table stores solution to already computed sub-problems
    // i.e. lookup[i][j] stores the length of LCS of substring
    // X[0..i-1] and Y[0..j-1]
    private int[][] lookup;

    // Constructors: Taking two sequence as parameters
    public LongestCommonSubSeq(String X, String Y)
    {
        this.X = X;
        this.Y = Y;
    }

    // Function to find length of Longest Common Subsequence of substring
    // X[0..m-1] and Y[0..n-1]
    public void LCSLength()
    {
        int m = X.length(), n = Y.length();

        lookup = new int[m + 1][n + 1];

        //Fill the lookup table in bottom-up manner
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                // if current character of X and Y matches
                if (X.charAt(i - 1) == Y.charAt(j - 1))
                {
                    commonSubSeq.append(X.charAt(i-1));

                    lookup[i][j] = lookup[i - 1][j - 1] + 1;
                }
                // else if current character of X and Y don't match,
                else
                {
                    lookup[i][j] = Integer.max( lookup[i - 1][j], lookup[i][j - 1]);
                }
            }
        }

        max_length = lookup[m][n];
        max_index1 = m;
        max_index2 = n;

        System.out.printf("1.1: The max. length of common sub seq in X: %s, and Y: %s, is: %d\n", X, Y, max_length);

        System.out.printf("1.2: The common sub seq is: %s\n", commonSubSeq);
    }

}

