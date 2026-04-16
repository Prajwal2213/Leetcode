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
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findLength(root);
        return res;

    }

    public int findLength(TreeNode root){
       if(root == null) return 0;

       int l = findLength(root.left);
       int r = findLength(root.right);

       res = Math.max(res, l + r);
       return 1 + Math.max(l,r);

    }
}