class Solution {
    public String longestCommonPrefix(String[] strs) {

        String str=strs[0];
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<str.length();j++){
            
        for(int i=1;i<strs.length;i++){
            
            if(j>=strs[i].length() ||str.charAt(j)!=strs[i].charAt(j)){

               return sb.toString();
        
            }

        }
        sb.append(str.charAt(j));
        }
        return sb.toString();
        
    }
}