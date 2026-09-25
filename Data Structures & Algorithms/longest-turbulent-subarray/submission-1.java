class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int inc=1;
        int dec=1;
        int result=1;
        int prev=arr[0];
        for(int curr:arr){
            if(prev>curr){
                dec=inc+1;
                inc=1;
            }else if(prev<curr){
                inc=dec+1;
                dec=1;

            }else{
                inc=1;
                dec=1;
            }
            result=Math.max(result,Math.max(inc,dec));
            prev=curr;
        }
        return result;
    }
}