import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReaderSingleton {
    private static FileReaderSingleton instance;

    private FileReaderSingleton() {
    }

    public static synchronized FileReaderSingleton getInstance() {
        if (instance == null) {
            instance = new FileReaderSingleton();
        }
        return instance;
    }

    public List<String> readLines(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return lines;
    }
}