// Input: root = [5,4,8,11,null,13,4,7,2,null,null,5,1], targetSum = 22
// Output: [[5,4,11,2],[5,8,4,5]]
// Explanation: There are two paths whose sum equals targetSum:
// 5 + 4 + 11 + 2 = 22
// 5 + 8 + 4 + 5 = 22

helper(root, currList, currSum, target){
  //nlr
  if(root==null){
    return 0;
  }
  
  if(root.left==null && root.right==null){
    currSum += root.val;
    if(currSum==target){
      currList.add(root.val);
      result.add(new ArrayList(currList));
      currList.remove(currList.size()-1);
    }
  }
  currSum+=root.val;
  helper(root.left, currList, currSum, target);
  helper(root.right, currList, currSum, target);
  currList.remove(currList.size()-1);
}
