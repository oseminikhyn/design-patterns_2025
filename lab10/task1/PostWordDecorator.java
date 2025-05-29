public class PostWordDecorator extends PrintableDecorator {
    private final String word;

    public PostWordDecorator(Printable printable, String word) {
        super(printable);
        this.word = word;
    }

    @Override
    public void print() {
        printable.print();
        System.out.print(word);
    }
}