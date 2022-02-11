import factory.Dialog;
import factory.HtmlDialog;
import factory.MacDialog;
import factory.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        switch (System.getProperty("os.name")) {
            case "Windows 10" -> dialog = new WindowsDialog();
            case "Mac OS X" -> dialog = new MacDialog();
            default -> dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
