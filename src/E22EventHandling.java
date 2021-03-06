import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Implementing an eventHandler as:
 * 1. a separate class
 * 2. main class (what about handling multiple events)?
 * 3. an inner class
 * 
 * @author tylerconklin
 *
 */
public class E22EventHandling extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane p = new BorderPane();

        // Handling a button press
        Button b = new Button("PressMe");

        // This is where you set the event handler
        b.setOnAction((e) -> {
            System.out.println("Lambda Function.");
        });

        // Finish setting the stage
        p.setCenter(b);
        primaryStage.setScene(new Scene(p));
        primaryStage.show();

    }
}
