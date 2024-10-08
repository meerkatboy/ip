package meerkatpack;

import com.sun.javafx.sg.prism.NGGroup;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import taskpack.TaskList;

import java.io.FileNotFoundException;
import java.util.Scanner; // Import the Scanner class

/**
 * meerkatpack.Main class that runs the program.
 */
public class Meerkat {

    private static final String STORAGE_FILE_PATH = "meerkat.txt";
    private static Storage storage = new Storage();
    private static Parser parser = new Parser();
    private Ui ui = new Ui();

    public void run() {
        ui.showGreetingMessage();
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        while (true) {
            // scans the new text for new info
            String taskName = scanner.nextLine();
            // splits string based on space
            parser.parse(taskName);
        }
    }

    public static void main(String[] args) {
        new Meerkat().run();
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        return parser.parse(input);
    }
}

