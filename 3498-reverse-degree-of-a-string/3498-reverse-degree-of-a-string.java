class Solution {
    public int reverseDegree(String s) {
        int totalSum = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int reverseVal = 26 - (chars[i] - 'a');
            int position = i + 1;
            totalSum += reverseVal * position;
        }
        return totalSum;
    }
}