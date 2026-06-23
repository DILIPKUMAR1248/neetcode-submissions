class Solution { 
    // ye function check karta hai ki dono trees same hain ya nahi
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p == null || q == null){
            return p == q;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return false;
        }
        
        // 1. Agar current node se hi same tree shuru ho jata hai
        if(isSameTree(root, subRoot)){
            return true;
        }
        
        // 2. Warna left ya right me dhundo
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}