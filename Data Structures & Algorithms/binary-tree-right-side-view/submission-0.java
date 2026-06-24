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
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){

           int size=q.size();
            if(size==0){
                return ans;
            }
            int data=0;
            while(size>0){
                TreeNode temp=q.poll();
                data=temp.val;
            if(temp.left!=null){
                q.add(temp.left);

            } if(temp.right!=null){
                q.add(temp.right);
            }
            size--;
        }
        ans.add(data);
        }
        return ans;
    }
}
