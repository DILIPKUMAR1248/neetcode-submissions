class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length()<str2.length()){
            return "";
        }
        Set<Character> st=new HashSet<>();
        for(int i=0;i<str2.length();i++){
            st.add(str2.charAt(i));
        }
        int len=st.size();
        return str1.substring(0,len);

        
    }
}