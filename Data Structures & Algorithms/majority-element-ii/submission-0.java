class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int condidate1=0,condidate2=0;
        int count1=0,count2=0;

        for(int num:nums){
            if(num==condidate1){
                count1++;
            } else if(num==condidate2){
                count2++;
            }else if(count1==0){
                condidate1=num;
                count1=1;
            }
            else if(count2==0){
                condidate2=num;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        for(int num:nums){
            if(num==condidate1){
                count1++;
            }else if(num==condidate2){
                count2++;
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
            if(count1>nums.length/3){
                list.add(condidate1);
            }
            if(count2>nums.length/3){
                list.add(condidate2);
            }
                
         return list;  
        
        
    }
}