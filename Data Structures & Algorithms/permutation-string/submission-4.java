class Solution {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int left = 0;
        int length = s1.length();

        for (int right = 0; right < s2.length(); right++) {

            if (right - left + 1 == length) {

                boolean bol = check(s1, s2, left, right);

                if (bol) {
                    return true;
                }

                left++;
            }
        }

        return false;
    }

    public static boolean check(String s1, String s2, int left, int right) {

        char[] ch = s1.toCharArray();

        String window = s2.substring(left, right + 1);
        char[] ch1 = window.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);

        String str = new String(ch);
        String str1 = new String(ch1);

        return str.equals(str1);
    }
}