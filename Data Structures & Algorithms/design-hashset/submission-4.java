class MyHashSet {
    boolean bol[];

    public MyHashSet() {
        bol=new boolean[1000001];
        
    }
    
    public void add(int key) {
        bol[key]=true;
        
    }
    
    public void remove(int key) {
        bol[key]=false;
        
    }
    
    public boolean contains(int key) {
        return bol[key];
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */