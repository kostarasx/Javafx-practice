import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;



public class AlertBox2 {

	public static void display(String title , String message ) {
		 Stage window = new Stage();
		 
		 window.initModality(Modality.APPLICATION_MODAL);
		 window.setTitle(title);
		 window.setMinWidth(300);
		 window.setMinHeight(300);
		 
		 Label label = new Label();
		 label.setText(message);
		 Button closeButoon = new Button ("PAOKARAAAAAAAAAA");
		 closeButoon.setOnAction(e -> window.close());
		 
		 VBox layout = new VBox(100);
		 layout.getChildren().addAll(label, closeButoon);
		 
		 
		 Scene  scene = new Scene(layout);
		 window.setScene(scene);
	     window.showAndWait();   
		 
		 
		 
	}
}
