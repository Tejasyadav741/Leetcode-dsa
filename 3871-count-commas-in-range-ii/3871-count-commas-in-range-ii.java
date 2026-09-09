class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        long divisor = 1000; 
        while (n >= divisor) {
            totalCommas += (n - divisor + 1);
            divisor *= 1000;
        }
        return totalCommas;
    }
}