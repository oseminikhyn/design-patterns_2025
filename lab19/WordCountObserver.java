public class WordCountObserver implements LineObserver {
    private int wordCount = 0;

    @Override
    public void onLine(String line) {
        wordCount += line.split("\\s+").length;
    }

    public int getWordCount() {
        return wordCount;
    }
}
