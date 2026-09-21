class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int ans=0;
        for(int num:nums){
            int count=0;
            while(set.contains(num)){
                count++;
                num++;
            }
            ans=Math.max(count,ans);
        }
        return ans;
        
    }
}
