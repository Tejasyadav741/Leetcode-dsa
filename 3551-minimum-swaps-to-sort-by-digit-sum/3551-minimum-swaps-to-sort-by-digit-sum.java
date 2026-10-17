class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            long val = nums[i];
            long sum = getDigitSum(nums[i]);
            arr[i] = (sum << 47) | (val << 17) | i;
        }
        Arrays.sort(arr);
        boolean[] visited = new boolean[n];
        int swaps = 0;
        for (int i = 0; i < n; i++) {
            int originalIndex = (int) (arr[i] & 0x1FFFFL);
            if (visited[i] || originalIndex == i) {
                continue;
            }
            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = (int) (arr[j] & 0x1FFFFL);
                cycleSize++;
            }
            if (cycleSize > 1) {
                swaps += (cycleSize - 1);
            }
        }
        return swaps;
    }
    private int getDigitSum(int val) {
        int sum = 0;
        while (val > 0) {
            sum += val % 10;
            val /= 10;
        }
        return sum;
    }
}