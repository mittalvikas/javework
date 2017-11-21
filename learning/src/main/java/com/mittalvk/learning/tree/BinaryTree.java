package com.mittalvk.learning.tree;

import java.util.Arrays;

public class BinaryTree {

	TreeNode root;

	
	//Given a binary tree, print all root-to-leaf paths
	public void printPaths() {
		
		int[] paths=new int[100];
		traverseReccursive(this.root,paths,0);
		
		
	}

	private void traverseReccursive(TreeNode node, int[] paths, int i) {
		if(node==null)return;
		
		paths[i++]=node.data;
		
		if(node.left==null && node.right==null){
			printArray(paths,i);
		}else{
			traverseReccursive(node.left, paths, i);
			traverseReccursive(node.right, paths, i);
			
		}
		
		
		
	}
	
	
	
	//Print all leaf nodes of a Binary Tree from left to right
	public void traversefromLeftToRight(TreeNode node){
		
		if(node==null)return;
		if(node.left==null && node.right==null){
			System.out.println(node.data);
		}else{
			traversefromLeftToRight(node.left);
			traversefromLeftToRight(node.right);
		}
		
		
		
	}
	
	
	
	/* Utility function that prints out an array on a line. */
    void printArray(int ints[], int len) 
    {
        int i;
        for (i = 0; i < len; i++) 
        {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }
	
}
