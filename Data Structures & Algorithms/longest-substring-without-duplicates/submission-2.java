class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        for(int i=0;i<s.length()-2;i++){
            char ch=s.charAt(i);
            for(int j=i+1;j<s.length();j++){
                if(ch==s.charAt(j)){
                    ans=Math.max(ans,j-i);
                    break;
                }
            }
        }
        return ans;
    }
}
