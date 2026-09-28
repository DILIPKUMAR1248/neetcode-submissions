class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        ArrayList<Integer> list=new ArrayList<>();
        solve(nums,n,0,list,ans);
        return ans;
        
    }
    public void solve(int[] nums,int n,int index,ArrayList<Integer> list,List<List<Integer>> ans){
        if(index==n){
             ans.add(new ArrayList<>(list));
             return;
        }
        list.add(nums[index]);
        solve(nums,n,index+1,list,ans);
         list.remove(list.size() - 1);
        solve(nums,n, index + 1, list, ans);

    }
}
