// Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
// Output: [3,9,20,null,null,15,7]



helper(inorder, int isi, int iei, postorder, int psi, int pei){

  int idx = isi;
  TreeNode root = new TreeNode(postorder[pei]);

  while(inorder[idx]!=postorder[pei]){
    idx++;
  }

  int telem = idx - isi;

  root.left = helper(inorder, isi, idx-1, postorder, psi, psi+telem-1);
  root.right = helper(inorder, idx+1, postorder, psi+telem, pei);

  return root;
  
}
