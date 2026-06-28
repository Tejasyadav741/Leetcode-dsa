class Solution {
    public boolean isValid(String s) {
        char[] array = new char[s.length()];
        int p = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                p++;
                array[p] = c;
            } else {
                if (p == -1) {
                    return false;
                }
                char last = array[p];
                if ((c == ')' && last == '(') || 
                    (c == ']' && last == '[') || 
                    (c == '}' && last == '{')) {
                    p--;
                } else {
                    return false;
                }
            }
        }
        return p == -1;
    }
}