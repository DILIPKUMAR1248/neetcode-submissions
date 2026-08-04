class FreqStack {
    Map<Integer,Integer> freq;
    Map<Integer,Stack<Integer>> group;
    int maxFreq;

    public FreqStack() {
        freq=new HashMap<>();
        group=new HashMap<>();
        maxFreq=0;
        
    }
    
    public void push(int val) {
        int f=freq.getOrDefault(val,0)+1;
        freq.put(val,f);
        if(maxFreq<f){
            maxFreq=f;
        }
        group.putIfAbsent(f,new Stack<>());
        group.get(f).push(val);
        
    }
    
    public int pop() {
        int ans=group.get(maxFreq).pop();
        freq.put(ans,freq.get(ans)-1);
        if(group.get(maxFreq).isEmpty()){
            maxFreq--;
        }
        return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */