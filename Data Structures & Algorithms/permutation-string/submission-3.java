class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();

        if (n > s2.length()) {
            return false;
        }

        char[] ch = s1.toCharArray();
        Arrays.sort(ch);

        String str = new String(ch);

        for (int i = 0; i <= s2.length() - n; i++) {

            String str1 = s2.substring(i, i + n);

            char[] ch1 = str1.toCharArray();
            Arrays.sort(ch1);

            String str2 = new String(ch1);

            if (str.equals(str2)) {
                return true;
            }
        }

        return false;
    }
}