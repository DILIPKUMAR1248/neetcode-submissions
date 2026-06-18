class Solution {
    public int leastInterval(char[] tasks, int n) {
        

        int[] freq=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;

        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int fq:freq){
            if(fq>0) pq.offer(fq);
        }
  int time=0;
        while(!pq.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            int cycle=n+1;
            while(cycle>0 && !pq.isEmpty()){
                int curr=pq.poll();
                if(curr>1){
                    temp.add(curr-1);
                }
                time++;
                cycle--;
            }
            for(int x:temp){
              pq.add(x);
            }

            if(pq.isEmpty()){
                break;
            }
            time+=cycle;
        }
        return time;
    }
}
