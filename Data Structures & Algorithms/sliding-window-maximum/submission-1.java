class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int prefixMax[] = new int[nums.length];
        prefixMax[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixMax[i] = Math.max(nums[i], prefixMax[i - 1]);
        }

        List<Integer> list = new ArrayList<>();

        int count = k+1;
        int prevNum = prefixMax[nums.length - 1];

        list.add(prevNum);

        for (int i = nums.length - 2; i >= 0; i--) {

            if (prevNum != prefixMax[i]) {
                count--;
            }

            list.add(prefixMax[i]);

            if (count == 0) {
                break;
            }
        }

        int[] result = new int[list.size()];

        int j = list.size() - 1;

        for (int i = 0; i < list.size(); i++) {
            result[j] = list.get(i);
            j--;
        }

        return result;
    }
}