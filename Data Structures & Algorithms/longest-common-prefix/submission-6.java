class Solution {
    public String longestCommonPrefix(String[] strs) {

        String str=strs[0];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            for(int j=1;j<strs.length;j++){
                if(str.charAt(i)!=strs[j].charAt(i)){
                    return sb.toString(); 
                }
            }
            sb.append(str.charAt(i));
        }

        return sb.toString();
        
    }
}