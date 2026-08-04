class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int pile:piles){
            right=Math.max(pile,right);
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(allKokoEating(piles,mid,h)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
        
    }
    public static boolean allKokoEating(int[] piles,int mid,int h){
          int time=0;
        for(int pile:piles){
          if(pile%mid>0){
            time++;
          }
          time+=pile/mid;
          
            
        }
        if(time<=h){
            return true;
        }
        return false;
    }
}
