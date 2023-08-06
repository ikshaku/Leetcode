// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
// Input: root = [1,2,2,3,4,4,3]
// Output: true 
                //         1
                //       /    \
                //     2        2
                //   /   \     / \
                // 3      4   4   3

// 3 2 4 1 4 2 3 if inorder ran then palindrome is all i need to validate right?
//something better reqd?

helper(TreeNode left, TreeNode right){   //in main pass execute helper(root.left, root.right)

  if(left==null && right==null){
    return true;
  }

  if(left==null || right==null){
    return false;
  }
  
  if(left.val!=right.val){
    return false;
  }
  
  boolean outside = helper(left.left, right.right);
  boolean inside = helper(left.right, right.left);

  return outside && inside;
  
}
