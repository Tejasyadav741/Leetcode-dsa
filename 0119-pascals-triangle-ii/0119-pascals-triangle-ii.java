class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(rowIndex + 1);
        long currentVal = 1; 
        for (int i = 0; i <= rowIndex; i++) {
            result.add((int) currentVal);
            currentVal = currentVal * (rowIndex - i) / (i + 1);
        }
        return result;
    }
}