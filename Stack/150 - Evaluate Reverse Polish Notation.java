class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/"))
                stack.push(Integer.valueOf(tokens[i]));

            else if (tokens[i].equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                int c = a / b;
                stack.push(c);
            }

            else if (tokens[i].equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                int c = a * b;
                stack.push(c);
            }

            else if (tokens[i].equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                int c = a + b;
                stack.push(c);
            }

            else {
                int b = stack.pop();
                int a = stack.pop();
                int c = a - b;
                stack.push(c);
            }
        }

        return stack.peek();
    }
}