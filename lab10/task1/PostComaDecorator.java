public class PostComaDecorator extends PrintableDecorator {
    public PostComaDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print() {
        printable.print();
        System.out.print(",");
    }
}