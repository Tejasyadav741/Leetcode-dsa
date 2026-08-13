class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> result = new ArrayList<>();
        for (String word : words) {
            String lowerWord = word.toLowerCase();
            boolean isValidInRow1 = true;
            boolean isValidInRow2 = true;
            boolean isValidInRow3 = true;
            for (char c : lowerWord.toCharArray()) {
                if (row1.indexOf(c) == -1) isValidInRow1 = false;
                if (row2.indexOf(c) == -1) isValidInRow2 = false;
                if (row3.indexOf(c) == -1) isValidInRow3 = false;
            }
            if (isValidInRow1 || isValidInRow2 || isValidInRow3) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}