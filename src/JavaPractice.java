import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaPractice extends Application {

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("JavaFX - thenewboston");
        button = new Button("Click Me");

       window.setOnCloseRequest(e -> {
    	   e.consume();
    	   closeProgramm();
       });
        
        button.setOnAction(e -> closeProgramm());
            
       

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void closeProgramm() {
    	Boolean answer = ConfirmBox.display("Test", "Are you sure you want to exit");
    	if(answer) {
    		Platform.exit();
    	}
    }
    
}
