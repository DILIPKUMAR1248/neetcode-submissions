class MyHashMap {
    int[] element;

    public MyHashMap() {
        element=new int[1000001];
        Arrays.fill(element, -1);
    }
    
    public void put(int key, int value) {
        element[key]=value;
        
    }
    
    public int get(int key) {
        return element[key];
        
    }
    
    public void remove(int key) {
        element[key]=-1;
        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */