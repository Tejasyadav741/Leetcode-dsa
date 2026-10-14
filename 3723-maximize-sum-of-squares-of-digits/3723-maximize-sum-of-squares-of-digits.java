class Solution {
    public String maxSumOfSquares(int num, int sum) {
       if (sum > 9L * num) {
            return "";
        }
        int count9s = sum / 9;
        int remainder = sum % 9;
        char[] result = new char[num];
        int index = 0;
        for (int i = 0; i < count9s; i++) {
            result[index++] = '9';
        }
        if (remainder > 0) {
            result[index++] = (char) ('0' + remainder);
        }
        while (index < num) {
            result[index++] = '0';
        }
        return new String(result);
    }
}