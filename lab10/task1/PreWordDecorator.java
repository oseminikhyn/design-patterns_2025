public class PreWordDecorator extends PrintableDecorator {
    private final String word;

    public PreWordDecorator(Printable printable, String word) {
        super(printable);
        this.word = word;
    }

    @Override
    public void print() {
        System.out.print(word);
        printable.print();
    }
}