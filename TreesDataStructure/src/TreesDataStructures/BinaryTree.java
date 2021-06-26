package TreesDataStructures;

public class BinaryTree 
{
	Node root;
	BinaryTree()
	{
		root =null;
	}

	void preorder(Node node)
	{
		if(node == null)
			return;
		
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	
	void postorder(Node node)
	{
		if(node == null)
			return;
		postorder(node.left);
		postorder(node.right);
		
		System.out.print(node.data+" ");
	}
	public static void main(String[] args) 
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		System.out.println("Preorder traversal of binary tree is ");
		tree.preorder();
		
		System.out.println("Postorder traversal of binary tree is ");
		tree.postorder();
	}
	
	void preorder()
	{
		preorder(root);
	}
	void postorder()
	{
		postorder(root);
	}
}
