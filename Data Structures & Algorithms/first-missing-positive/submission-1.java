class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        boolean[] seen = new boolean[n];

        for (int num : nums) {
            if (num > 0 && num <= n) {
                seen[num - 1] = true;
            }
        }

        for (int num = 1; num <= n; num++) {
            if (!seen[num - 1]) {
                return num;
            }
        }

        return n + 1;
    }
}