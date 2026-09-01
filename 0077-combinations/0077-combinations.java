class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, n, k);
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> currentList, int start, int n, int k) {
        if (currentList.size() == k) {
            result.add(new ArrayList<>(currentList));
            return;
        }
        for (int i = start; i <= n - (k - currentList.size()) + 1; i++) {
            currentList.add(i);
            backtrack(result, currentList, i + 1, n, k);
            currentList.remove(currentList.size() - 1);
        }
    }
}