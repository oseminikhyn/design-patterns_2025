import java.io.*;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FileReader {

    private final String filePath;
    private final List<LineObserver> observers = new CopyOnWriteArrayList<>();

    public FileReader(String filePath) {
        this.filePath = filePath;
        Thread thread = new Thread(this::read);
        thread.start();
    }

    public void subscribe(LineObserver observer) {
        observers.add(observer);
    }

    private void notifyObservers(String line) {
        for (LineObserver observer : observers) {
            observer.onLine(line);
        }
    }

    public void read() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath))) {
            reader.lines().forEach(this::onLineRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void onLineRead(String line) {
        notifyObservers(line);
    }
}