class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] dirs = path.split("/");

        for (String dir : dirs) {

            // ignore empty parts and "."
            if (dir.equals("") || dir.equals(".")) {
                continue;
            }

            // go to parent directory
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            // normal directory name
            else {
                stack.push(dir);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String dir : stack) {
            sb.append("/").append(dir);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}