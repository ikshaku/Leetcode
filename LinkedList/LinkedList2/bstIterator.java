// Implement the BSTIterator class that represents an iterator over the in-order traversal of a binary search tree (BST):

// BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.
// boolean hasNext() Returns true if there exists a number in the traversal to the right of the pointer, otherwise returns false.
// int next() Moves the pointer to the right, then returns the number at the pointer.
// Notice that by initializing the pointer to a non-existent smallest number, the first call to next() will return the smallest element in the BST.

// You may assume that next() calls will always be valid. That is, there will be at least a next number in the in-order traversal when next() is called.
import java.util.Stack;

public class BSTIterator {
	 Stack<TreeNode> stack;
	    public BSTIterator(TreeNode root) {
	        stack=new Stack<>();
	        helper(root);
	    }
	    
	    public int next() {
	        TreeNode node=stack.pop();
	        helper(node.right);
	        return node.val;
	    }
	    
	    public boolean hasNext() {
	        return !stack.isEmpty();
	    }
	    
	    public void helper(TreeNode root){
	        if(root==null){
	            return;
	        }
	        
	        stack.push(root);
	        helper(root.left);
	    }
	    
	    public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode() {}
		      TreeNode(int val) { this.val = val; }
		      TreeNode(int val, TreeNode left, TreeNode right) {
		          this.val = val;
		          this.left = left;
		          this.right = right;
	  	      }
	  }
}
