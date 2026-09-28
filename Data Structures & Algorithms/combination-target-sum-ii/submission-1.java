class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates,0,list,ans,target);
        return ans;
        
    }
    public void solve(int[] nums,int index,List<Integer> list,List<List<Integer>> ans,int target){
        
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }if(target<nums[i]){
                break;
            }
            list.add(nums[i]);
            solve(nums,i+1,list,ans,target-nums[i]);

              list.remove(list.size() - 1);
        }


        
    }
}
