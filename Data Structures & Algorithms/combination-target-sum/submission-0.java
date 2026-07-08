class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        solve(nums,0,target,subset,ans);
       return ans;
        
    }
    public static void solve(int [] nums,int i,int target,List<Integer> subset,List<List<Integer>> ans){

        if(i==nums.length){
            return;
        }
        if(target==0){
            ans.add(new ArrayList<>(subset));
            return;
        }
        if(nums[i]<=target){
            subset.add(nums[i]);
            solve(nums,i,target-nums[i],subset,ans);
            subset.remove(subset.size()-1);
        }
        solve(nums,i+1,target,subset,ans);
    }
}
