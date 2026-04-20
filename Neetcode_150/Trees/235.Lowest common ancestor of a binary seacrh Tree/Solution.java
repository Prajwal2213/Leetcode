/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
1.If P and Q are in the left and right subtree , then commom ancestor will be root node
2.If P and Q are Less than root value then, both Nodes are in the Left SubTree -> function(root.left, p ,q)
3.If P and Q are Greater than root value then, both Nodes are in the Right SubTree -> function(root.right, p ,q)*/


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null || p == null || q == null) return null;

       if(p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);

       if(p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
     
        return root;
    }

}
/* 
Time complexity : O(H)
Space Complexity: O(H)
 */