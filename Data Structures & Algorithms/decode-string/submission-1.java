class Solution {
    public String decodeString(String s) {

        Stack<Integer> number = new Stack<>();
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);

            if(Character.isDigit(ch)){

                int num = 0;

                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                i--;
                number.push(num);
            }

            else if(ch == '['){
                stack.push("[");
            }

            else if(ch == ']'){

                String str = "";

                while(!stack.peek().equals("[")){
                    str = stack.pop() + str;
                }

                stack.pop();

                int repeat = number.pop();

                StringBuilder temp = new StringBuilder();

                for(int j = 0; j < repeat; j++){
                    temp.append(str);
                }

                stack.push(temp.toString());
            }

            else{
                stack.push(ch + "");
            }
        }

        StringBuilder ans = new StringBuilder();

        while(!stack.isEmpty()){
            ans.insert(0, stack.pop());
        }

        return ans.toString();
    }
}