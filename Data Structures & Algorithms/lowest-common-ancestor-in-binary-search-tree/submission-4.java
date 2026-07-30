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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root==null){
            return root;
        }
        if(root.val==p.val|| root.val==q.val){
            return root;
        }
        TreeNode lcaLeft=lowestCommonAncestor(root.left,p,q);
        TreeNode lcaRight=lowestCommonAncestor(root.right,p,q);

        if(lcaLeft!=null && lcaRight!=null){
            return root;
        }else if(lcaLeft==null){
            return lcaRight;
        }else{
            return lcaLeft;
        }
    }
}
