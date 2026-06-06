class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int size = nums.length;

        while(i<size){
            if(nums[i]<=0 || nums[i]>size)
                i++;
            else{
                if(nums[i]-1==i || nums[i]==nums[nums[i]-1])
                    i++;
                else
                    swap(nums,i,nums[i]-1);
            }
        }

        int j=0;
        while(j<size){
            if(nums[j]-1==j)
                j++;
            else
                return j+1;
        }
        return nums[j-1]+1;
    }

    void swap(int[] arr, int a , int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}