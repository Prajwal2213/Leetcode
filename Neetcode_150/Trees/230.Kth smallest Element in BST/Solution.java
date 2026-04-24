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
    List<Integer> arrList = new ArrayList<>();
    
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        TreeTraverse(root);
        return arrList.get(k - 1);

    }

    private void TreeTraverse(TreeNode root){
        if(root == null) return;

        TreeTraverse(root.left);
        arrList.add(root.val);
        TreeTraverse(root.right);
    }
}