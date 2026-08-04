class Solution {
    public int largestRectangleArea(int[] heights) {
        int[] ps=previousSmallerElement(heights);
        int[] ns=nextSmallerElement(heights);
        int ans=0;
        for(int i=0;i<heights.length;i++){
            int curr=(ns[i]-ps[i]-1)*heights[i];
            ans=Math.max(curr,ans);

        }
        return ans;
    }
   public int[] previousSmallerElement(int[] arr){

    Stack<Integer> st = new Stack<>();
    int[] ps = new int[arr.length];

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

      public int[] nextSmallerElement(int[] arr){

    Stack<Integer> st = new Stack<>();
    int[] ns = new int[arr.length];

    for(int i=arr.length-1;i>=0;i--){

        while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
            st.pop();
        }

        if(st.isEmpty()){
            ns[i]=arr.length;
        }else{
            ns[i]=st.peek();
        }

        st.push(i);
    }

    return ns;
}
}
