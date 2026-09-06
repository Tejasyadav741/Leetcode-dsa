class Solution {
    public int arrayPairSum(int[] nums) {
        int[] freq = new int[20001];
        for (int num : nums) {
            freq[num + 10000]++;
        }
        
        int maxSum = 0;
        boolean shouldPick = true;
        for (int i = 0; i <= 20000; i++) {
            while (freq[i] > 0) {
                if (shouldPick) {
                    maxSum += (i - 10000);
                }
                shouldPick = !shouldPick;
                freq[i]--;
            }
        }
        return maxSum;
    }
}