class Solution {
    public int mySqrt(int x) {


        int left=1;
        int right=x;
        if(x<2) return x;
        while(left<=right){
        
          int mid=left+(right-left)/2;
            long square = (long) mid * mid;
        if(mid*mid==x){
            return mid;
        }else if(mid*mid<x){
            left=mid+1;
        }else{
            right=mid-1;
        }
        }
        return right;
    }
}