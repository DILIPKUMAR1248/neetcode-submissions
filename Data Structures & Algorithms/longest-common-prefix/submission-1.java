class Solution {
    public String longestCommonPrefix(String[] strs) {
      String str1=strs[0];
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<str1.length();i++){
        char ch=str1.charAt(i);

        for(int j=1;j<strs.length;j++){
            if(i<strs[j].length() && ch!=strs[j].charAt(i))
            return sb.toString();
        }
        sb.append(ch);


      }
      return sb.toString();
    }
}