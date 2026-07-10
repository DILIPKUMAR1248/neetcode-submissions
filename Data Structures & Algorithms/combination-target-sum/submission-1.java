class Solution {
    public static void solve(int[] nums,int target,int index,List<List<Integer>> list,
    List<Integer> subset){
        if(index==nums.length){
            return;
        }
        if(target ==0){
            list.add(new ArrayList<>(subset));
            return;
        }
        //include
        subset.add(nums[index]);
        solve(nums,target-nums[index],index+1,list,subset);
           subset.remove(subset.size()-1);
        solve(nums,target,index+1,list,subset);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {

        List<List<Integer>> list=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        solve(nums,target,0,list,subset);
        return list;
        
    }
}
