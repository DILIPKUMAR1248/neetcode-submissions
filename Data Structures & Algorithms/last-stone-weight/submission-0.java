class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(stones[0]);
         int ans=0;
        for(int i=1;i<stones.length;i++){
           int ele=stones[i];

           if(pq.peek()==ele){
            pq.poll();
           } else if(pq.peek()<ele){
              pq.add(ele-pq.poll());
           } else{
            pq.add(pq.poll()-ele);
           }

           }
           return pq.size()>0 ? pq.peek():0;
        }
        
    }

