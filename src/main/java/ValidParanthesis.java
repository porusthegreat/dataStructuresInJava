import java.util.Stack;

class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '['  || c == '{' || c == '(')
                stack.push(c);

            if (stack.isEmpty())
                return false;

            if (c == ')') {

                if (stack.peek().equals('('))
                    stack.pop();
                else return false;
            }

            if (c == ']') {
                if (stack.peek().equals('['))
                    stack.pop();
                else return false;
            }

            if (c == '}') {
                if (stack.peek().equals('{'))
                    stack.pop();
                else return false;
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.isValid("[[({})]]"));
    }
}