abstract class FileHandler {
    protected FileHandler next;

    public FileHandler setNext(FileHandler next) {
        this.next = next;
        return next;
    }

    public abstract void open(String fileName);
}

class ImageHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        if (fileName.endsWith(".jpg") || fileName.endsWith(".png")) {
            System.out.println("Opening image file: " + fileName);
        } else if (next != null) {
            next.open(fileName);
        } else {
            System.out.println("Unsupported file format: " + fileName);
        }
    }
}

class WordHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        if (fileName.endsWith(".doc") || fileName.endsWith(".docx")) {
            System.out.println("Opening Word document: " + fileName);
        } else if (next != null) {
            next.open(fileName);
        } else {
            System.out.println("Unsupported file format: " + fileName);
        }
    }
}

class ExcelHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        if (fileName.endsWith(".xls") || fileName.endsWith(".xlsx")) {
            System.out.println("Opening Excel spreadsheet: " + fileName);
        } else if (next != null) {
            next.open(fileName);
        } else {
            System.out.println("Unsupported file format: " + fileName);
        }
    }
}

class PowerPointHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        if (fileName.endsWith(".ppt") || fileName.endsWith(".pptx")) {
            System.out.println("Opening PowerPoint presentation: " + fileName);
        } else if (next != null) {
            next.open(fileName);
        } else {
            System.out.println("Unsupported file format: " + fileName);
        }
    }
}

class PDFHandler extends FileHandler {
    @Override
    public void open(String fileName) {
        if (fileName.endsWith(".pdf")) {
            System.out.println("Opening PDF document: " + fileName);
        } else if (next != null) {
            next.open(fileName);
        } else {
            System.out.println("Unsupported file format: " + fileName);
        }
    }
}


public class Client {
    public static void main(String[] args) {

        String[] files = {
            "image.jpg",
            "image.png",
            "document.docx",
            "document.doc",
            "table.xls",
            "table.xlsx",
            "presentation.pptx",
            "document.pdf",
            "unknown.xyz"
        };

        FileHandler handlerChain = new ImageHandler();
        handlerChain
            .setNext(new WordHandler())
            .setNext(new ExcelHandler())
            .setNext(new PowerPointHandler())
            .setNext(new PDFHandler());

        for (String file : files) {
            handlerChain.open(file);
        }
    }
}