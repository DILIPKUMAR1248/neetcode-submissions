class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length()!=t.length()){
        return false;
      }

      int ans[]=new int[26];
      for(char ch:s.toCharArray()){
         int index=ch-'a';
         ans[index]++;
      }
       for(char ch:t.toCharArray()){
         int index=ch-'a';
         ans[index]--;
      }
       for(int num:ans){
         if(num!=0){
            return false;
         }
      }
return true;

    }
}
