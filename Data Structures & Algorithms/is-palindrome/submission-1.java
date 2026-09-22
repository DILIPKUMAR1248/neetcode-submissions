class Solution {
    public boolean isPalindrome(String s) {

      String st=s.replaceAll("[^a-zA-Z0-9]","");
      String st1=st.replace(" ","");
      String str=st1.toLowerCase();

      int n=str.length()-1;
      int i=0;
      while(i<n){
        if(str.charAt(i)!=str.charAt(n)){
            return false;
        }
        i++;
        n--;
      }
      return true;
    }
}
