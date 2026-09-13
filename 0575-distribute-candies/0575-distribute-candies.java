class Solution {
    public int distributeCandies(int[] candyType) {
        int maxAllowed = candyType.length / 2;
        boolean[] seen = new boolean[200001];
        int uniqueCount = 0;
        for (int candy : candyType) {
            if (!seen[candy + 100000]) {
                seen[candy + 100000] = true;
                uniqueCount++;
                if (uniqueCount == maxAllowed) {
                    return maxAllowed;
                }
            }
        }
        return Math.min(uniqueCount, maxAllowed);
    }
}