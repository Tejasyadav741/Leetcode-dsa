class Solution {
    public int majorityElement(int[] nums) {
        int value = 0;
        int c = 0;
        for (int n : nums) {
            if (c == 0) {
                value = n;
            }
            if (n == value) {
                c++;
            } else {
                c--;
            }
        }
        return value;
    }
}