class Solution {
    public int findDuplicate(int[] nums) {
       int duplicate=0;
       for(int i=0;i<nums.length;i++){
        if(i+1!=nums[i]){
            duplicate=nums[i];
            break;
        }
       } 
       return duplicate;
    }
}
