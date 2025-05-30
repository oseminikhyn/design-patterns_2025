public class LongestWordFinder implements LineObserver {
    private String longestWord = "";

    @Override
    public void onLine(String line) {
        for (String word : line.split("\\s+")) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }

    public String getLongestWord() {
        return longestWord;
    }
}