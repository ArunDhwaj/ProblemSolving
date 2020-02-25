package com.sbp.ProblemSolving;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class BinaryTreeHeight
{
    // Data structure to store a Binary Tree node
    private class Node
    {
        int key;
        Node left, right;

        Node(int key)
        {
            this.key = key;
            this.left = this.right = null;
        }
    }

    private Node root = null;

    public void insertNode(int data)
    {
        if(root == null)
        {
            root = new Node(data);
        }
        else
        {
            root = insertNode(root, data);
        }
    }

    private Node insertNode(Node temp, int data)
    {
        if(temp == null)
        {
            temp = new Node(data);
        }
        else
        {
            if(data > temp.key)
            {
                temp.right = insertNode(temp.right, data);
            }
            else
            {
                temp.left = insertNode(temp.left, data);
            }
        }

        return temp;
    }

    // Iterative function to calculate height of given binary tree
    // by doing level order traversal of the tree
    public int height()
    {
        // Empty tree has height 0
        if (root == null)
        {
            return 0;
        }

        // Create an empty queue and enqueue root node
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        Node front = null;
        int height = 0;

        System.out.printf("\nLevel: %d\n", height);
        System.out.printf("%d,\t", root.key);

        // Do till queue is not empty
        while ( !queue.isEmpty() )
        {
            // calculate number of nodes in current level
            int size = queue.size();

            System.out.printf("\nLevel: %d\n", height+1);

            // process each node of current level and enqueue their
            // non-empty left and right child to queue
            while (size-- > 0)
            {
                //System.out.printf("\n1.2 Level: %d\n", height+1);

                front = queue.poll();

                if (front.left != null)
                {
                    System.out.printf("%d,\t", front.left.key);
                    queue.add(front.left);
                }

                if (front.right != null)
                {
                    System.out.printf("%d,\t", front.right.key);
                    queue.add(front.right);
                }
            }

            // increment height by 1 for each level
            height++;
        }

        return height;
    }

    public int diameterOfBinaryTree()
    {
        AtomicInteger diameter = new AtomicInteger(0);
        getDiameter(root, diameter);

        return diameter.get();
    }

    private int getDiameter(Node root, AtomicInteger diameter)
    {
        if(root == null)
            return 0;

        //Get heights of the left and right subtree;
        int left_h = getDiameter(root.left, diameter);
        int right_h = getDiameter(root.right, diameter);

        //calculate diameter through the current node
        int max_diameter = left_h + right_h + 1;

        //Updating the Maximum Diameter
        diameter.set(Math.max(diameter.get(), max_diameter));

        //return height of subtree rooted at current node
        return Math.max(left_h, right_h) + 1;
    }
}
