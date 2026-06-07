class Solution {
    public int maxArea(int[] nums) {
       int area=0;
  int left=0,right=nums.length-1;
      while(left<=right){

        if(nums[left]<=nums[right]){
               area= Math.max(nums[left]*(right-left),area);
               left++;
        }else{
                area=Math.max(nums[right]*(right-left),area);
                right--;
        }

      } 
      return area; 
    }
}
