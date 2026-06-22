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
    public int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+(Math.max(maxDepth(root.left),maxDepth(root.right)));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        int total=left+right;

        int leftroot=diameterOfBinaryTree(root.left);
        int rightroot=diameterOfBinaryTree(root.right);
        return Math.max(total,Math.max(leftroot,rightroot));
    }
}
