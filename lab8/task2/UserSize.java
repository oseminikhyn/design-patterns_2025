public class UserSize implements Size {
    private final String customSize;

    public UserSize(String customSize) {
        this.customSize = customSize;
    }

    public String getSize() {
        return customSize;
    }
}
