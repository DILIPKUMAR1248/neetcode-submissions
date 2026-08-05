

class LRUCache {

    class Pair {
        int key;
        int value;

        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    ArrayList<Pair> cache;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new ArrayList<>();
    }

    public int get(int key) {

        for (int i = 0; i < cache.size(); i++) {

            if (cache.get(i).key == key) {

                Pair temp = cache.get(i);

                cache.remove(i);      // Remove from current position

                cache.add(temp);      // Move to end (Most Recently Used)

                return temp.value;
            }
        }

        return -1;
    }

    public void put(int key, int value) {

        // Check if key already exists
        for (int i = 0; i < cache.size(); i++) {

            if (cache.get(i).key == key) {

                cache.remove(i);

                cache.add(new Pair(key, value));

                return;
            }
        }

        // Cache full
        if (cache.size() == capacity) {

            cache.remove(0);   // Remove Least Recently Used
        }

        cache.add(new Pair(key, value));
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */