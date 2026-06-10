class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> st=new Stack<>();
        for(String str:tokens){
            if(str.equals("+")){
               int first=st.pop();
               int secound=st.pop();
               st.push(first+secound);
            }
             else if(str.equals("*")){
               int first=st.pop();
               int secound=st.pop();
               st.push(first*secound);
            }
             else if(str.equals("-")){
               int first=st.pop();
               int secound=st.pop();
               st.push(first-secound);
            }
             else if(str.equals("/")){
               int first=st.pop();
               int secound=st.pop();
               st.push(secound/first);
            }else{
            st.push(Integer.parseInt(str));
        }
        }
       return st.peek(); 
    }
}
