class Solution {
    
    int number = 0;
    int result = 0;
    
    class Pair{
        
        TreeNode node;
        int value;
        
        public Pair(TreeNode node, int value){
            
            this.node = node;
            this.value = value;
            
        }
        
        public TreeNode getNode(){
            
            return this.node;
            
        }
        
        public int getValue(){
            
            return this.value;
            
        }
        
    }
    
    public int sumNumbers(TreeNode root) {
        
        // int result = 0;
        // int number = 0;
        
//         Stack<Pair> stack = new Stack<>();
        
//         while(root!=null || !stack.isEmpty()){
            
//             while(root!=null){
                
//                 //NLR
//                 number = number * 10 + root.val;
//                 Pair pair = new Pair(root,number);
                
//                 stack.push(pair);
                
//                 root=root.left;
                
//             }
            
//             Pair pair = stack.pop();
//             root = pair.getNode();
//             number = pair.getValue();
            
//             if(root.left==null && root.right==null){
                
//                 result+=number;
                
//             }
            
//             root = root.right;
            
//         }
        
        // return result;
        
        return helper(root,0);
        
    }
    
    public int helper(TreeNode root, int number){
        
        if(root==null){
            return 0;
        }
        
        if(root.left==null && root.right==null){
            
            result+=number*10 + root.val;
            return result;
            
        }
        
        number = number * 10 + root.val;
        
        helper(root.left, number);
        helper(root.right, number);
        
        return result;
        
    }
    
}
