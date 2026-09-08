class Solution {
    public int countCommas(int n) {
        int totalCommas = 0;
        long divisor = 1000;
        while (n >= divisor) {
            totalCommas += (n - divisor + 1);
            divisor *= 1000;
        }
        return totalCommas;
    }
}