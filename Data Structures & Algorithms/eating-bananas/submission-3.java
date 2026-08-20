class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
    int left=1;
    int right=Integer.MIN_VALUE;
    for(int i=0;i<piles.length;i++){
        
        right=Math.max(piles[i],right);
    }
    while(left<=right){
        int mid=left+(right-left)/2;

        if(eatKoko(piles,mid,h)){
            right=mid-1;
        }else{
            left=mid+1;
        }
    }
       return left;
        
    }
    public boolean eatKoko(int[] piles,int mid,int h){
        int time=0;
        for(int num:piles){
            time=time+num/mid;
            int n=num%mid;
            if(n>0){
                time++;
            }
        }
        if(time<=h){
            return true;
        }
        return false;
    }
}
