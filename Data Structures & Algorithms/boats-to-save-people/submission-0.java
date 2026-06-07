class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people); // 1 2 2 3 3 
      int count=0;
      int left=0,right=people.length-1;
        while(left<=right){
                if(people[left]+people[right]<=limit){
                        left++;
                        
                }
                        count++;
                        right--;

                
        }
        return count;
    }
}