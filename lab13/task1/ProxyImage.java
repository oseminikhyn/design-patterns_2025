public class ProxyImage implements DisplayObject {
    private final String path;
    private ImageFile realImage;

    public ProxyImage(String path) {
        this.path = path;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new ImageFile(path);
        }
        realImage.display();
    }
}
