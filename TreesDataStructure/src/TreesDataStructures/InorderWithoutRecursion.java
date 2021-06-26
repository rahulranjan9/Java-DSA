package TreesDataStructures;
import java.util.Stack;

public class InorderWithoutRecursion {
	Node root;
	
	public static void main(String[] args) 
	{
		InorderWithoutRecursion tree = new InorderWithoutRecursion();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		
		tree.inorder();
	}
	void inorder()
	{
		if(root == null)
			return;
		
		Stack<Node> stack = new Stack<Node> ();
		Node curr = root;
		
		while(curr!=null || stack.size() > 0)
		{
			while(curr != null)
			{
				stack.push(curr);
				curr = curr.left;
			}
			
			curr = stack.pop();
			System.out.print(curr.data+" ");
			
			curr = curr.right;
		}		
	}

}
