public class LongestLineFinder implements LineObserver {
    private String longestLine = "";

    @Override
    public void onLine(String line) {
        if (line.length() > longestLine.length()) {
            longestLine = line;
        }
    }

    public String getLongestLine() {
        return longestLine;
    }
}