// How to validate a bst?
// using prev remember to declare globally not in each node

TreeNode prev = null;

helper(root){
  
  if(root==null) return true; //u dont wanna return false here  
  //lnr
    boolean left = helper(root.left);
    if(prev!=null && prev.val>=root.val){
      return false;
    }
    prev = root;
    
    boolean right = helper(root.right);

    return left && right;
}

//does this make sense guys?
//ok let me tell u the iterative approach? guess what ds we will use, obviously stacks right

validateBST(TreeNode root){
  Stack<TreeNode> stack = new Stack(); //lnr approach only
  while(stack.isEmpty()==false || root!=null){
    while(root!=null){
      stack.push(root);
      root=root.left;
    }
    root=stack.pop();
    if(prev!=null && prev.val>=root.val){
      return false;
    }
    prev=root;
    root=root.right;
  }
  return true;
}
