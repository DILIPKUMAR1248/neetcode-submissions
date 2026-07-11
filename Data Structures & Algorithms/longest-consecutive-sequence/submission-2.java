class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        
        int max=0;

        for(int n:nums){
            int count=0;
            int num=n;
            while(set.contains(num)){
                count++;
                num=num+1;
            }
            max=Math.max(count,max);

        }
       return max; 
    }
}
