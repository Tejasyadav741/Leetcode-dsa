class Solution {
    public int totalNumbers(int[] digits) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int digit : digits) {
            map.put(digit, map.getOrDefault(digit, 0) + 1);
        }
        int validCount = 0;
        for (int i = 100; i <= 998; i += 2) {
            int d1 = i / 100;
            int d2 = (i / 10) % 10;
            int d3 = i % 10;
            map.put(d1, map.getOrDefault(d1, 0) - 1);
            map.put(d2, map.getOrDefault(d2, 0) - 1);
            map.put(d3, map.getOrDefault(d3, 0) - 1);
            if (map.get(d1) >= 0 && map.get(d2) >= 0 && map.get(d3) >= 0) {
                validCount++;
            }
            map.put(d1, map.get(d1) + 1);
            map.put(d2, map.get(d2) + 1);
            map.put(d3, map.get(d3) + 1);
        }
        return validCount;
    }
}