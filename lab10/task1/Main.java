public class Main {
    public static void main(String[] args) {
        Printable printable = new PrintableString("");

        printable = new PreWordDecorator(printable, "Hello");
        printable = new PostComaDecorator(printable);
        printable = new PostSpaceDecorator(printable);
        printable = new PostWordDecorator(printable, "World");
        printable = new PostExclaimDecorator(printable);
        printable = new PostEndlDecorator(printable);

        printable.print();  // Output: Hello, World!
    }
}