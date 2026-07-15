class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> dupli = new HashSet<>(nums.length);
        for (int num : nums) {
            if (!dupli.add(num)) {
                return true; 
            }
        }
        return false;
    }
}