class Solution {
    public int maxProfit(int[] nums) {
        int ans=0;
        int buyDay=nums[0];
        for(int i=0;i<nums.length;i++){
            int sellDay=nums[i];
            if(buyDay<sellDay){
                ans=ans+(sellDay-buyDay);
            }
            buyDay=nums[i];
        }
        return ans;
        
    }
}