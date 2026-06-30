class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }
        int limit = haystack.length() - needle.length();
        for (int i = 0; i <= limit; i++) {
            String window = haystack.substring(i, i + needle.length());
            if (window.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}