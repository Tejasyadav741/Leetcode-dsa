class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int previous = 0;
        int current = 0;
        for (int step = 0; step <= (nums1.length + nums2.length) / 2; step++) {
            previous = current;
            if (i < nums1.length && (j >= nums2.length || nums1[i] < nums2[j])) {
                current = nums1[i];
                i++;
            } else {
                current = nums2[j];
                j++;
            }
        }
        if ((nums1.length + nums2.length) % 2 == 1) {
            return (double) current;
        } else {
            return (previous + current) / 2.0;
        }
    }
}