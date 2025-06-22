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
    public static void path(TreeNode root, int target, List<Integer> arr, List<List<Integer>> ans){
        if(root == null) return;
        target -= root.val;
        arr.add(root.val);
        if(target == 0 && root.left == null && root.right == null){
            ans.add(new ArrayList(arr));
            
        }

        path(root.left, target, arr, ans);
        path(root.right, target, arr, ans);
        arr.remove(arr.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        path(root, targetSum, arr, ans);
        return ans;
    }
}