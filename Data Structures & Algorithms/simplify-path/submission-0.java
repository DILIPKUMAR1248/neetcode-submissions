class Solution {
    public String simplifyPath(String path) {

        Stack<String> st=new Stack<>();
        String [] parts=path.split("/");

        for(String str:parts){
            if(str.equals("") || str.equals(".")){
                continue;
            }else if(!str.equals("..")){
                st.push(str);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        StringBuilder sb=new StringBuilder();
        if(st.isEmpty()){
            return "/";
        }
        for(String str1:st){
            sb.append("/").append(str1);
        }
        return sb.toString();
    }
}