public class StringBuilderProduct {
    private final StringBuilder builder;

    public StringBuilderProduct() {
        this.builder = new StringBuilder();
    }

    public void append(String sequence) {
        builder.append(sequence);
    }

    public void insert(int index, String sequence) {
        builder.insert(index, sequence);
    }

    public String getResult() {
        return builder.toString();
    }
}
