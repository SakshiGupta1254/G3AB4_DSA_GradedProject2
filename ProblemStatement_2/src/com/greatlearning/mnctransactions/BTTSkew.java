package com.greatlearning.mnctransactions;


public class BTTSkew {
	public static Node newNode(int z) 
	{
		Node temp = new Node();
		temp.left =null;
		temp.data = z;
		temp.right = null;
		return temp;
	}
	
	    public static Node node;
	    static Node prevNode = null;
	    static Node headNode = null;
	    static void BTToSkewed(Node root)
	    {
	       
	        if(root == null)
	        {
	            return;
	        }
	       
	        BTToSkewed(root.left);
	        
	        Node rightNode = root.right;
	        Node leftNode = root.left;
	       
	        if(headNode == null)
	        {
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        }
	        else
	        {
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }
	       
	      
	            BTToSkewed(rightNode);
	        
	    }
	   
	    static void RightSkewed(Node root)
	    {
	        if(root == null)
	        {
	            return;
	        }
	        System.out.print(root.data + " ");
	        RightSkewed(root.right);       
	    }
	   
	    public static void main (String[] args)
	    {
	        BTTSkew tree = new BTTSkew();
	        tree.node = newNode(50);
	        tree.node.left = newNode(30);
	        tree.node.right = newNode(60);
	        tree.node.left.left = newNode(10);
	        tree.node.right.left= newNode(55);

	        BTToSkewed(node);
	        RightSkewed(headNode);
	    }
	
}
