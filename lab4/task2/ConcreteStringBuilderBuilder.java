public class ConcreteStringBuilderBuilder implements StringBuilderBuilder {
    private final StringBuilderProduct product = new StringBuilderProduct();

    @Override
    public void append(String sequence) {
        product.append(sequence);
    }

    @Override
    public void insert(int index, String sequence) {
        product.insert(index, sequence);
    }

    @Override
    public String build() {
        return product.getResult();
    }
}