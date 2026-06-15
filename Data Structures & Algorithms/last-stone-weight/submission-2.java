class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int x = pq.poll(); // largest
            int y = pq.poll(); // second largest

            if (x != y) {
                pq.offer(x - y);
            }
        }

        return pq.isEmpty() ? 0 : pq.peek();
    }
}