class Solution {
    public static void solve(int[] nums,List<List<Integer>> list,List<Integer> subset,int i){
        if(i==nums.length){
            list.add(new ArrayList<>(subset));
            return;
        }
        //include
        subset.add(nums[i]);
        solve(nums,list,subset,i+1);
        //Exclude
        subset.remove(subset.size()-1);
        solve(nums,list,subset,i+1);

    }

    public int subsetXORSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
         int result=0;
         int i=0;
        solve(nums,list,subset,i);
        for(List<Integer>  num:list){
            int xor=0;
            for(int n:num){
              xor^=n;

                          }
                          result+=xor;
        }

        
      return result;  
    }
}