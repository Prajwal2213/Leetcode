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
    int maximum = 0;
    public int goodNodes(TreeNode root) {
        if(root == null) return 0;
        return dfs(root, root.val);

    }

    private int dfs(TreeNode node, int maxi){
        if(node == null) return 0;

         int count = 0;
        if(node.val >= maxi) count += 1;

        maxi = Math.max(maxi, node.val);

        count += dfs(node.left, maxi);
        count += dfs(node.right, maxi);

        return count;

    }
}