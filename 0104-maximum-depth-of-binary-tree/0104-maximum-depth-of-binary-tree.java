/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // static int helper(TreeNode root){
    //     if(root == null) return 0;

    //     int left = 1 + helper(root.left);
    //     int right = 1 + helper(root.right);

    //     return Math.max(left, right);
    // }
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) +1;
    }
}