class Solution {

    public static int maxSum(int[] nums) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            if (sum < 0)
                sum = 0;

            sum += num;
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static int minSum(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int sum = 0;

        for (int num : nums) {
            if (sum > 0)
                sum = 0;

            sum += num;
            ans = Math.min(ans, sum);
        }
        return ans;
    }

    public int maxSubarraySumCircular(int[] nums) {

        int maxsum = maxSum(nums);
        int minsum = minSum(nums);

        int totalSum = 0;
        for (int num : nums)
            totalSum += num;

        // all negative case
        if (maxsum < 0)
            return maxsum;

        return Math.max(maxsum, totalSum - minsum);
    }
}