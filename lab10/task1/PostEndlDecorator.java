public class PostEndlDecorator extends PrintableDecorator {
    public PostEndlDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        printable.print();
        System.out.print("\n");
    }
}