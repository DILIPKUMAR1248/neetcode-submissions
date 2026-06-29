class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans=0;
        int ps[]=previousSmallerElement(heights);
        int ns[]=nextSmallerElement(heights);

        for(int i=0;i<heights.length;i++){
            int curr=(ns[i]-ps[i]-1)*heights[i];
            ans=Math.max(ans,curr);
        }
        return ans;
    }
    public static int[] previousSmallerElement(int[] arr){
        Stack<Integer> st=new Stack<>();
        int ps[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ps[i]=-1;
            }else{
                ps[i]=st.peek();
            }
            st.push(i);
        }
        return ps;
    } 
    public static int[] nextSmallerElement(int[] arr){
        Stack<Integer> st=new Stack<>();
        int ps[]=new int[arr.length];

        for(int i=arr.length-1;i>=0;i--){

            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ps[i]=arr.length;
            }else{
                ps[i]=st.peek();
            }
            st.push(i);
        }
        return ps;
    } 
}
