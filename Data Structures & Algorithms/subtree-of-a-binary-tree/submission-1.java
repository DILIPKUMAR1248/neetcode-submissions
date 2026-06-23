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
    public boolean sub(TreeNode p, TreeNode q){
        if(p==null || q==null){
            return p==q;
        }
        if(p.val!=q.val){
            return false;
        }
        return sub( p.left,q.left) && sub( p.right,q.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
       if(sub(root.left,subRoot)) {
            return true;
       }


         return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
     

    }
}
