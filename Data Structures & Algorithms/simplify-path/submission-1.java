class Solution {
    public String simplifyPath(String path) {

        char[] ch = path.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == '.') {
                continue;
            }

            else if (ch[i] == '/') {

                if (i == 0 || ch[i - 1] != '/') {
                    sb.append(ch[i]);
                }

            } else {
                sb.append(ch[i]);
            }
        }

        return sb.toString();
    }
}