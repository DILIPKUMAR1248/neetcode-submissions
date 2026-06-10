class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int num:asteroids){
            boolean distroy=false;

            while(!st.isEmpty() && num<0 && st.peek()>0){

                if(st.peek()<-num){
                    st.pop();
                }else if(st.peek()==-num){
                    st.pop();
                    distroy=true;
                    break;
                }
                else{
                    distroy=true;
                    break;
                }
            }
            if(!distroy){
                st.push(num);
            }
        }
        int[] ans = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}