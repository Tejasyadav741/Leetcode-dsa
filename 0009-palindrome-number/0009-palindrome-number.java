class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int digits = (int) Math.log10(x) + 1;
        int div = (int) Math.pow(10, digits - 1);
        int iterations = digits / 2;
        for (int i = 0; i < iterations; i++) {
            int first = x / div;
            int last = x % 10;
            if (first != last) {
                return false;
            }
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}