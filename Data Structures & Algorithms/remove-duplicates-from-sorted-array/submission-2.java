class Solution {
    public int removeDuplicates(int[] nums) {

        int left=0;
        nums[left]=nums[0];
        int count=1;
        for(int n:nums){
            if(nums[left]!=n){
                left++;

                nums[left]=n;
                count++;
            }
        }
       return count; 
    }
}