class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 2;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            int g = 0;
            int l = 1;

            for (int j = i; j < n; j++) {
                int x = nums[j];
                prod *= x;
                if (prod > 25200) {
                    break;
                }
                g = (g == 0) ? x : gcd(g, x);
                l = (l / gcd(l, x)) * x;

                if (prod == l * g) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}