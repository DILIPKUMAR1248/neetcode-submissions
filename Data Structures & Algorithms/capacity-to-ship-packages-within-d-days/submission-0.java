class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int maxWeight = 0;
        int totalWeight = 0;

        for (int w : weights) {
            maxWeight = Math.max(maxWeight, w);
            totalWeight += w;
        }

        int left = maxWeight;
        int right = totalWeight;
        int ans = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int requiredDays = 1;
            int currentLoad = 0;

            for (int w : weights) {

                if (currentLoad + w > mid) {
                    requiredDays++;
                    currentLoad = 0;
                }

                currentLoad += w;
            }

            if (requiredDays <= days) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}