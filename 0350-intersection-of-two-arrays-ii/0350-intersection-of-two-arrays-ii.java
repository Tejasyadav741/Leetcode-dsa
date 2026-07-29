class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] counts = new int[1001];
        for (int num : nums1) {
            counts[num]++;
        }
        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (counts[num] > 0) {
                resultList.add(num);
                counts[num]--;
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}