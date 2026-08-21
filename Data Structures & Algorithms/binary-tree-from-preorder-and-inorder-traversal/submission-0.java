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
    public TreeNode buildTree(int[] pre, int[] in) {
        return Tree(pre, in, 0,pre.length-1,0);
        
    }
    public  TreeNode Tree(int[] pre,int[] in,int InStart,int InEnd,int index){

        if(InStart>InEnd){
            return null;
        }

        TreeNode root=new TreeNode(pre[index]);
        int pos=find(in,pre[index],InStart,InEnd);

        root.left=Tree(pre,in,InStart,pos-1,index+1);
        root.right=Tree(pre,in,pos+1,InEnd,index+(pos-InStart)+1);
        return root;
    }
    public  int find(int[] in,int target,int instart,int inEnd){
        for(int i=0;i<in.length;i++){
            if(in[i]==target){
                return i;
            }
        }
        return -1;
    }
}
