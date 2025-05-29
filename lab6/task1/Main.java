import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileReaderSingleton reader = FileReaderSingleton.getInstance();
        String filePath = "C:\\java\\design-patterns_2025\\lab6\\task1\\example.txt"; 
        List<String> lines = reader.readLines(filePath);
        System.out.println("=== Зміст файлу ===");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
