
class Solution {
    public void invert(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        
    }

    public boolean same(TreeNode p, TreeNode q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;
        if(!same(p.left,q.left)) return false;
        if(!same(p.right,q.right)) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        invert(root.right);
        if(same(root.left,root.right) == false) return false;
        return true;
    }
}