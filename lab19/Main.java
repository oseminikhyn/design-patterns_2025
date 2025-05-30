public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("C:\\java\\design-patterns_2025\\lab19\\input01.txt");

        LongestLineFinder longestLineFinder = new LongestLineFinder();
        LongestWordFinder longestWordFinder = new LongestWordFinder();
        WordCountObserver wordCountObserver = new WordCountObserver();
        LineWithLongestWordFinder lineWithLongestWordFinder = new LineWithLongestWordFinder();

        fileReader.subscribe(longestLineFinder);
        fileReader.subscribe(longestWordFinder);
        fileReader.subscribe(wordCountObserver);
        fileReader.subscribe(lineWithLongestWordFinder);

        try {
            Thread.sleep(1000); // Wait for file to be fully read
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Longest line: " + longestLineFinder.getLongestLine());
        System.out.println("Longest word: " + longestWordFinder.getLongestWord());
        System.out.println("Word count: " + wordCountObserver.getWordCount());
        System.out.println("Line with longest word: " + lineWithLongestWordFinder.getLineWithLongestWord());
    }
}
