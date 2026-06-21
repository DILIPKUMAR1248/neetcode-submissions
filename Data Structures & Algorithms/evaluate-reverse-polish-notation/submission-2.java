class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")){
                int first=st.pop();
                int secound=st.pop();
                st.push(first+secound);
            } else if(token.equals("/")){
                int first=st.pop();
                int secound=st.pop();
                st.push(secound/first);
            } else if(token.equals("*")){
                int first=st.pop();
                int secound=st.pop();
                st.push(first*secound);
            } else if(token.equals("-")){
                int first=st.pop();
                int secound=st.pop();
                st.push(secound-first);
            }else{
            st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}
