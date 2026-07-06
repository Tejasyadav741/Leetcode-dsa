class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;
        int previous = 0;
        int current = 0;
        for (int step = 0; step <= (m + n) / 2; step++) {
            previous = current;
            if (i < m && (j >= n || nums1[i] < nums2[j])) {
                current = nums1[i];
                i++;
            } else {
                current = nums2[j];
                j++;
            }
        }
        if ((m + n) % 2 == 1) {
            return (double) current;
        } else {
            return (previous + current) / 2.0;
        }
    }
}