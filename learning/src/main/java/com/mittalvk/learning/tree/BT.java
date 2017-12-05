package com.mittalvk.learning.tree;
class Node 
{
    char data;
    Node left, right;
  
    public Node(char d) 
    {
        data = d;
        left = right = null;
    }
}
  
public class BT 
{
    Node root;
  
    void printZigZag(Node node) 
    {
        int h = claculateHeight(node);
        boolean direction = false;
        for (int i = 1; i <= h; i++) 
        {
            printMyTree(node, direction,i);
  
            direction = !direction;
        }
  
    }
  
    
    int claculateHeight(Node node) 
    {
        if (node == null) 
            return 0;
        else
        {
              
            int lheight = claculateHeight(node.left);
            int rheight = claculateHeight(node.right);
  
            if (lheight > rheight) 
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
  
    void printMyTree(Node node, boolean ltr, int level) 
    {
        if (node == null) 
            return;
        if (level == 1) 
            System.out.print(node.data + " ");
        else if (level > 1) 
        {
            if (ltr != false) 
            {
            	printMyTree(node.left, ltr,level - 1);
            	printMyTree(node.right,  ltr,level - 1);
            } 
            else
            {
            	printMyTree(node.right, ltr,level - 1);
            	printMyTree(node.left,  ltr,level - 1);
            }
        }
    }
    public static void main(String[] args) 
    {
    	
    	/*
    	Given below BT, print nodes in zigzag way
    	                                 A 
    	                               /    \
    	                             B      C
    	                            /   \    /   \
    	                          D    E  	F     G
    	                        /   \   / \  / \   /  \
    	                       H    I  J  K L  M  N    O
    	output : A B C G F E D H I J K L M N O
    	*/
    	
    	
        BT tree = new BT();
        tree.root = new Node('A');
        tree.root.left = new Node('B');
        tree.root.right = new Node('C');
        tree.root.left.left = new Node('D');
        tree.root.left.right = new Node('E');
        tree.root.right.left = new Node('F');
        tree.root.right.right = new Node('G');
        tree.root.left.left.left=new Node('H');
        tree.root.left.left.right=new Node('I');
        tree.root.left.right.left=new Node('J');
        tree.root.left.right.right=new Node('K');
        tree.root.right.left.left = new Node('L');
        tree.root.right.left.right = new Node('M');
        tree.root.right.right.left = new Node('N');
        tree.root.right.right.right = new Node('O');
        
        System.out.println("Zig Zag traversal of Binary Tree is ");
        tree.printZigZag(tree.root);
    }
}