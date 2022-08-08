package com.binaryTree;

public class BinaryTreeInsertion {
	
	Node root=null;
	
 class Node   
    {  
       public Node left;  
       public Node right;  
        int value;  
        public Node(int value)   
        {  
            this.value = value;  
        }  
    }  
 
 
 public void insert(int value) {
	 if(root==null) {
		 root=new Node(value);
	 }else {
		 
	 }
 }
 
 private void insert(Node node,int value) {
	 if(value<node.value) {
		 if(node.left!=null) {
			 insert(node.left,value);
		 }else {
			 node.left=new Node(value);
		 }
	 }else if(value>node.value) {
		 if(node.right!=null) {
			 insert(node.right,value);
		 }else {
			 node.right=new Node(value);
		 }
	 }
 }
 
 
 

}
