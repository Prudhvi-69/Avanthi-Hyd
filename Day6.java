class  Day6{  
	static class Node{
		int  data;
		Node right;
		Node left;
	
		Node( int  value )
		{
			this.data = value;
			right = null;
			left = null;
		} 
	}
		Node root;
		
		void preorder( Node node) 
		{ 
			if( node == null ) 
				return;
			else
			{ 
				System.out.print(" "+node.data);
				preorder( node.left ); 
				preorder( node.right );
			}
		}


 		void inorder( Node node) 
		{ 
			if( node == null ) 
				return;
			else
			{ 
				inorder( node.left ); 
				System.out.print(" "+node.data);		
				inorder( node.right );
			}
		}

		void postorder( Node node) 
		{ 
			if( node == null ) 
				return;
			else
			{ 
				postorder( node.left ); 
				postorder( node.right );
		System.out.print(" "+node.data);
			}
		}

		public static void main(String avanthi[])
		{
			Day6 tree = new Day6();
			
			tree.root = new Node(106);
			tree.root.left = new Node(44);
			tree.root.right = new Node(56);
			tree.root.right.left = new Node(999);
            
            System.out.println("\nInorder Traversal of the tree is : ");
			tree.inorder(tree.root);
            System.out.println("\nPreorder Traversal of the tree is : ");
			tree.preorder(tree.root);
            System.out.println("\nPostorder Traversal of the tree is : ");
			tree.postorder(tree.root);

		}
} 


		






