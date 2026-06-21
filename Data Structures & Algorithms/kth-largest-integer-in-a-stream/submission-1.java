class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(); // min-heap by default

        for (int num : nums) {
            add(num); // add() ka logic reuse kar lo
        }
    }

    public int add(int val) {
        minHeap.offer(val);

        // Heap ka size k se zyada nahi hona chahiye
        if (minHeap.size() > k) {
            minHeap.poll(); // sabse chota nikaal do
        }

        return minHeap.peek(); // top = Kth largest
    }
}