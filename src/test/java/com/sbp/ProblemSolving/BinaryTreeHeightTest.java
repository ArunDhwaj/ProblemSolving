package com.sbp.ProblemSolving;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class BinaryTreeHeightTest
{
    private BinaryTreeHeight bth;

    @Test
    public void testCase1()
    {
        bth = new BinaryTreeHeight();
        bth.insertNode(15);
        bth.insertNode(10);
        bth.insertNode(20);
        bth.insertNode(8);
        bth.insertNode(12);
        bth.insertNode(16);
        bth.insertNode(25);

        System.out.printf("The height of the binary tree: %d\n", bth.height());
        System.out.printf("The Diameter of the binary tree: %d\n", bth.diameterOfBinaryTree());
    }

    @Test
    public void testCase2()
    {
        bth = new BinaryTreeHeight();

        bth.insertNode(65);
        bth.insertNode(20);
        bth.insertNode(80);
        bth.insertNode(10);
        bth.insertNode(22);
        bth.insertNode(95);
        bth.insertNode(120);
        bth.insertNode(5);
        bth.insertNode(12);

        bth.insertNode(21);
        bth.insertNode(23);

        System.out.printf("The height of the binary tree: %d\n", bth.height());
        System.out.printf("The Diameter of the binary tree: %d\n", bth.diameterOfBinaryTree());
    }

    @Test
    public void testCase3()
    {
        bth = new BinaryTreeHeight();

        bth.insertNode(25);
        bth.insertNode(20);
        bth.insertNode(40);
        bth.insertNode(10);
        bth.insertNode(22);
        bth.insertNode(35);
        bth.insertNode(50);
        bth.insertNode(5);
        bth.insertNode(12);
        bth.insertNode(21);
        bth.insertNode(23);

        System.out.printf("The height of the binary tree: %d\n", bth.height());

        System.out.printf("The Diameter of the binary tree: %d\n", bth.diameterOfBinaryTree());

    }
}
