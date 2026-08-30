class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(result, new ArrayList<>(), nums, visited);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> currentList, int[] nums, boolean[] visited) {
        if (currentList.size() == nums.length) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            currentList.add(nums[i]);
            backtrack(result, currentList, nums, visited);
            currentList.remove(currentList.size() - 1);
            visited[i] = false;
        }
    }
}