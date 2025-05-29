public class PostExclaimDecorator extends PrintableDecorator {
    public PostExclaimDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        printable.print();
        System.out.print("!");
    }
}
