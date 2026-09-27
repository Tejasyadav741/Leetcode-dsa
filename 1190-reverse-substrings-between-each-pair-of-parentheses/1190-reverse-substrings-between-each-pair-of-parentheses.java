class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        int[] pairs = new int[n];
        int[] stack = new int[n];
        int top = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack[++top] = i;
            } else if (s.charAt(i) == ')') {
                int j = stack[top--];
                pairs[i] = j;
                pairs[j] = i;
            }
        }
        StringBuilder result = new StringBuilder();
        int i = 0;
        int direction = 1;
        while (i < n) {
            char c = s.charAt(i);
            if (c == '(' || c == ')') {
                i = pairs[i];
                direction = -direction;
            } else {
                result.append(c);
            }
            i += direction;
        }
        return result.toString();
    }
}