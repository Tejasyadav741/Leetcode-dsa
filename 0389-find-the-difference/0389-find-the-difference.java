class Solution {
    public char findTheDifference(String s, String t) {
        char result = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
            result ^= t.charAt(i);
        }
        return result;
    }
}