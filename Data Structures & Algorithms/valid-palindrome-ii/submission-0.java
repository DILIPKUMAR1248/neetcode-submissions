class Solution {
    public boolean validPalindrome(String s) {

        int left=0;
        int right=s.length()-1;
        int count=0;
        while(left<right){
            if(count==0 && s.charAt(left)!=s.charAt(right)){
                count++;
                if(s.charAt(left+1)==s.charAt(right)){
                    left++;
                }else{
                    right--;
                }


            }
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}