public interface StringBuilderBuilder {
    void append(String sequence);
    void insert(int index, String sequence);
    String build();
}