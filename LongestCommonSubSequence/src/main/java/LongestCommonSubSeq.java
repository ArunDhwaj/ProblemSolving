package main.java;

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

    // Character array to keep the characters of common sub sequences;
    private Character[] commonSubSeq;

    // Lookup table stores solution to already computed sub-problems
    // i.e. T[i][j] stores the length of LCS of substring
    // X[0..i-1] and Y[0..j-1]
    int[][] T;

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

        T = new int[m + 1][n + 1];

        //Fill the lookup table in bottom-up manner
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                // if current character of X and Y matches
                if (X.charAt(i - 1) == Y.charAt(j - 1))
                {
                    T[i][j] = T[i - 1][j - 1] + 1;
                }
                // else if current character of X and Y don't match,
                else
                {
                    T[i][j] = Integer.max(T[i - 1][j], T[i][j - 1]);
                }
            }
        }

        max_length = T[m][n];
        max_index1 = m;
        max_index2 = n;

        System.out.println("The max. length of common sub seq is: " + max_length);

    }

    // Function to find Characters in Longest Common Subsequence of substring
    // X[0..m-1] and Y[0..n-1]
    public void LCSCharacters()
    {
        commonSubSeq = new Character[max_length];

        int temp = max_length, p = max_index1, q = max_index2;

        while (p > 0 && q > 0)
        {
            if (X.charAt(p - 1) == Y.charAt(q - 1))
            {
                commonSubSeq[temp - 1] = X.charAt(p - 1);
                p--;
                q--;

                temp--;
            }
            else if (T[p - 1][q] > T[p][q - 1])
            {
                p--;
            }
            else if (T[p][q - 1] > T[p - 1][q])
            {
                q--;
            }
        }

        System.out.print("The characters in common sub seq are: " );

        for(int i=0; i< commonSubSeq.length; i++)
        {
            System.out.print(commonSubSeq[i]);
        }
    }
}

