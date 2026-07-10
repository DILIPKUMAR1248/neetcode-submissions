class Solution {

    public static void solve(int[] nums,int idx,List<List<Integer>> list){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            list.add(temp);
            return;
        }

        for(int i=idx;i<nums.length;i++){
            int t = nums[i];
            nums[i] = nums[idx];
            nums[idx] = t;
            solve(nums,idx+1,list);
             int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;


        }
    }
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> list=new ArrayList<>();
       solve(nums,0,list);
       return list; 
    }
}
