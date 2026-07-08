class Solution {
    public static void solve(int[] nums ,int i,List<List<Integer>> allSubset,List<Integer> subset){
        if(i==nums.length){
            allSubset.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        solve(nums,i+1,allSubset,subset);
        subset.remove(subset.size()-1);
        solve(nums,i+1,allSubset,subset);

    }
    public int subsetXORSum(int[] nums) {

        List<List<Integer>> allSubset=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        solve(nums,0,allSubset,subset);

        int result=0;
        for(List<Integer> list:allSubset){
            int xor=0;
            for(int num:list){
                xor^=num;
            }
            result+=xor;
        }
        return result;
    }
}