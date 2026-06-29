class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
            if (x == 2 || x == 3) {
            return 1;
        }
        int left = 2;
        int right = x / 2;
        int ans = 0; 
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;        
                left = mid + 1;   
            } else {
                right = mid - 1;  
            }
        }
        return ans; 
    }
}