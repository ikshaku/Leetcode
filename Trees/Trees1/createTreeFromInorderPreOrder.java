// preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
// [3,9,20,null,null,15,7]
createTreeFromInorderPreOrder(int[] inorder, int[] preorder){
  TreeNode root = new TreeNode(preorder[0]);
  int idx=0;
  while(int i = 0; i < inorder.length; i++){
    if(inorder[i]==root.val){
      idx = i;
      break;
    }
  }
  int[] leftSubtreePreoder = Arrays.copyOfRange(preorder, 1, inorderIndex+1);
  int[] leftSubtreeInorder = Arrays.copyOfRange(inorder, 0, inorderIndex);
            
  int[] rightSubtreePreorder = Arrays.copyOfRange(preorder, inorderIndex+1, preorder.length);
  int[] rightSubtreeInorder = Arrays.copyOfRange(inorder, inorderIndex+1, inorder.length);

  root.left = createTreeFromInorderPreOrder(leftSubtreePreoder, leftSubtreeInorder);
  root.right = createTreeFromInorderPreOrder(rightSubtreePreorder, rightSubtreeInorder);

  return root;
}
