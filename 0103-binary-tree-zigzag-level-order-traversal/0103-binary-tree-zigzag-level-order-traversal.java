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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
   
        List<Integer> level = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode curr = q.poll();

            if (curr == null) {
                ans.add(new ArrayList<>(level));
                level.clear();

                if (!q.isEmpty()) {
                    q.add(null); 
                }
            } else {
                level.add(curr.val);
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            if (i % 2 != 0) { // even index
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
}