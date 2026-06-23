class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case
        if(root == null || root == p || root == q){
            return root;
        }
        
        // Left aur right me dhundo
        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);
        
        
        if(leftLCA != null && rightLCA != null){
            return root;
        }
        
        
        return leftLCA != null ? leftLCA : rightLCA;
    }
}
