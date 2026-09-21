class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int ans=0;
        for(int num:nums){
            if(!set.contains(num - 1)) {

                int count = 1;
                int curr = num;

                while(set.contains(curr + 1)) {
                    curr++;
                    count++;
                }

                ans = Math.max(ans, count);
            }
        }
        return ans;
        
    }
}
