class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> subset=new ArrayList<>();
        List<Integer> currSubset=new ArrayList<>();
        solve(nums,0,currSubset,subset);
        return subset;
        
    }
    public static void solve(int[] nums,int i,List<Integer> currSubset,List<List<Integer>> subset){
        if(i==nums.length){
            subset.add(new ArrayList<>(currSubset));
            return;

        }
        currSubset.add(nums[i]);
        solve(nums,i+1,currSubset,subset);
        currSubset.remove(currSubset.size()-1);
        solve(nums,i+1,currSubset,subset);
    }
}
