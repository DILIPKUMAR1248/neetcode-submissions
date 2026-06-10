class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st=new Stack<>();
        for(int num:asteroids){
            
            if(num<0){
                if(st.peek()+num==0){
                st.pop();
               }
               else if(!st.isEmpty() && st.peek()>0){
                    st.push(Math.max(num*-1,st.pop()));
                }else{
                st.push(num);
                }
            }else{
                st.push(num);
            }
        }
        int n=st.size();
        int ans[]=new int[n];
        while(!st.isEmpty()){
            ans[n-1]=st.pop();
            n--;
        }
      return ans;  
    }
}