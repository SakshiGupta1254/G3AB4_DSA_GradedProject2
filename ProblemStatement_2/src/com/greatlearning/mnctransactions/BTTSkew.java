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
	    static Node firstNode = null;
	    static Node lastNode = null;
	    static void BTToSkewed(Node root)
	    {
	       
	        if(root == null)
	        {
	            return;
	        }
	       
	        BTToSkewed(root.left);
	        
	        Node rightNode = root.right;
	       
	        if(lastNode == null)
	        {
	            lastNode = root;
	            root.left = null;
	            firstNode = root;
	        }
	        else
	        {
	            firstNode.right = root;
	            root.left = null;
	            firstNode = root;
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
	        RightSkewed(lastNode);
	    }
	
}
