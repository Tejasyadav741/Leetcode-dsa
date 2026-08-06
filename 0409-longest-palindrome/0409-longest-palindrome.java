class Solution {
    public int longestPalindrome(String s) {
        int[] counts = new int[128];
        
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i)]++;
        }
        
        int length = 0;
        
        for (int count : counts) {
            length += (count / 2) * 2;
        }
        
        if (length < s.length()) {
            length++;
        }
        
        return length;
    }
}