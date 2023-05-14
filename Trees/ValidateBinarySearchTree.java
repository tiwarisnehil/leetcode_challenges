package Trees;

class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    boolean helper(TreeNode root,Integer minVal,Integer maxVal){
        if(root==null){
            return true;
        }
        if(minVal!=null && minVal>=root.val){
            return false;
        }
        if(maxVal!=null && maxVal<=root.val){
            return false;
        }
        boolean left=helper(root.left,minVal,root.val);
        boolean right=helper(root.right,root.val,maxVal);
        return left && right;
    }
}