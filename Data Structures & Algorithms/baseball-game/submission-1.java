class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();

        for(String str:op){
            if(str.equals("C")){
                st.pop();
            }
            else if(str.equals("D")){
                st.push(2*st.peek());
            }
            else if(str.equals("+")){
                int first=st.pop();
                int secound=st.peek();

                st.push(first);
                st.push(first+secound);
            }else{
            st.push(Integer.parseInt(str));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}