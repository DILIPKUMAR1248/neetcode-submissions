class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[2*nums.length];
        int i=0;
        for(int n:nums ){
            arr[i]=n;
            arr[i+nums.length]=n;
            i++;
        }
        return arr;
    }
}