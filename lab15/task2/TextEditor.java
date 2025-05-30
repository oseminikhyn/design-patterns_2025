public class TextEditor {

    private Document document;

    private final Button saveButton;
    private final Button printButton;

    private final MenuItem saveMenuItem;
    private final MenuItem printMenuItem;
    private final MenuItem showInfoMenuItem;

    private final Shortcut saveShortcut;
    private final Shortcut printShortcut;

    public TextEditor() {
        saveButton = new Button();
        printButton = new Button();

        saveMenuItem = new MenuItem();
        printMenuItem = new MenuItem();
        showInfoMenuItem = new MenuItem();

        saveShortcut = new Shortcut();
        printShortcut = new Shortcut();
    }

    public void newDocument(String name) {
        document = new Document(name);

        Command saveCommand = new SaveCommand(document);
        Command printCommand = new PrintCommand(document);
        Command infoCommand = new ShowInfoCommand(document);

        saveButton.setCommand(saveCommand);
        printButton.setCommand(printCommand);

        saveMenuItem.setCommand(saveCommand);
        printMenuItem.setCommand(printCommand);
        showInfoMenuItem.setCommand(infoCommand);

        saveShortcut.setCommand(saveCommand);
        printShortcut.setCommand(printCommand);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickPrintButton() {
        printButton.click();
    }

    public void selectSaveMenuItem() {
        saveMenuItem.select();
    }

    public void selectPrintMenuItem() {
        printMenuItem.select();
    }

    public void selectShowInfoMenuItem() {
        showInfoMenuItem.select();
    }

    public void pressSaveShortcut() {
        saveShortcut.press();
    }

    public void pressPrintShortcut() {
        printShortcut.press();
    }
}

