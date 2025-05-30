public class LineWithLongestWordFinder implements LineObserver {
    private String lineWithLongestWord = "";
    private String longestWord = "";

    @Override
    public void onLine(String line) {
        for (String word : line.split("\\s+")) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
                lineWithLongestWord = line;
            }
        }
    }

    public String getLineWithLongestWord() {
        return lineWithLongestWord;
    }
}