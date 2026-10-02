import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> a = new Stack<>();

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{') {
                a.push(ch);
            }
            else {

                if(a.isEmpty()) {
                    return false;
                }

                char top = a.pop();

                if(ch == ')' && top != '(') {
                    return false;
                }

                if(ch == ']' && top != '[') {
                    return false;
                }

                if(ch == '}' && top != '{') {
                    return false;
                }
            }
        }

        return a.isEmpty();
    }
}