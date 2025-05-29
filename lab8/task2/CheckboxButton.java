public class CheckboxButton extends Button {
    public CheckboxButton(Size size) {
        super(size);
    }

    public void draw() {
        System.out.println("Setting size to " + size.getSize() + "...");
        System.out.println("Drawing a checkbox button.\n");
    }
}