public class ImageGallery {
    public static void main(String[] args) {
        String path = "C:\\java\\design-patterns_2025\\lab13\\task1\\";

        DisplayObject[] images = {
                new ProxyImage(path + "image1.jpeg"),
                new ProxyImage(path + "image2.jpeg"),
                new ProxyImage(path + "image3.jpeg"),
                new ProxyImage(path + "image4.jpeg"),
                new ProxyImage(path + "image5.jpeg"),
                new ProxyImage(path + "image6.jpeg"),
                new ProxyImage(path + "image7.jpeg"),
                new ProxyImage(path + "image8.jpeg"),
                new ProxyImage(path + "image9.jpeg"),
                new ProxyImage(path + "image10.jpeg")
        };

        for (DisplayObject image : images) {
            image.display();
        }
    }
}