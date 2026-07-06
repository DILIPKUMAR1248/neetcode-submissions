class Solution {
    public int shipWithinDays(int[] weights, int days) {

        
        int low=weights[0];
        int high=0;
        for(int num:weights){
            
            low=Math.max(low,num);
            high+=num;

        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            int day=1;
             for(int num:weights){
            
                if(sum+num>mid){
                    day++;
                    sum=num;
                }else {
                    sum+=num;
                }
             }
             if(day<=days){
                ans=mid;
                high=mid-1; 
             }else{
                low=mid+1;
             }
        }

    
      return ans;  
    }
}