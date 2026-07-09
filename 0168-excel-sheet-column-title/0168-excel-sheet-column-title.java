class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            char letter = (char) ('A' + (columnNumber % 26));
            sb.append(letter);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}