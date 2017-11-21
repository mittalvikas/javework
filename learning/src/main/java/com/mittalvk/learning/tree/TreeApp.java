package com.mittalvk.learning.tree;

public class TreeApp {

	
	
	public static void main(String[] args) {
		
	BinaryTree tree=new BinaryTree();	
	 /* Constructed binary tree is
    10
  /   \
8      2
/  \    /
3     5  2
*/
		 tree.root=new TreeNode(10);
		 tree.root.left = new TreeNode(8);
	     tree.root.right = new TreeNode(2);
	     tree.root.left.left = new TreeNode(3);
	     tree.root.left.right = new TreeNode(5);
	     tree.root.right.left = new TreeNode(2);
	
	
	 /**
	  * 10 8 3 
		10 8 5 
		10 2 2    
	  */
	 tree.printPaths(); 
	 
	 
	 //EXTECTED OUTPUT SHOULD BE 3,5,2
	 tree.traversefromLeftToRight(tree.root);
	     
	     
	     
	     
	     
		
	}

}
