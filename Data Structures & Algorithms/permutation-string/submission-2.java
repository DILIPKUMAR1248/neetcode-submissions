class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int n = s1.length();

        // Sort s1 once
        char[] target = s1.toCharArray();
        Arrays.sort(target);
        String sortedS1 = new String(target);

        int left = 0;

        for (int right = n - 1; right < s2.length(); right++) {

            String sub = s2.substring(left, right + 1);

            if (permutation(sortedS1, sub)) {
                return true;
            }

            left++;
        }

        return false;
    }

    public static boolean permutation(String sortedS1, String str) {

        char[] ch = str.toCharArray();
        Arrays.sort(ch);

        String sortedStr = new String(ch);

        return sortedS1.equals(sortedStr);
    }
}