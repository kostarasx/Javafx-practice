import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class JavaPractice extends Application {
	Stage window;
    Scene scene1, scene2, scene3;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    	window = primaryStage;
    	
    	
        //Button 1
        Label label1 = new Label("Welcome to the first scene!");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout 1 - children laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);


        //Button 2
        Button button2 = new Button("This sucks, go back to scene");
        button2.setOnAction(e -> window.setScene(scene3));

        //Layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 600, 300);

        //Button 3
        
        Label  label2 = new Label("AM i right?");
        Button button3 = new Button ("Just me testing");
        button3.setOnAction(e -> window.setScene(scene1));
        
        //Layout 3
        VBox layout3 = new VBox(100);
        layout3.getChildren().addAll(label2, button3);
        scene3 = new Scene(layout3, 1000, 1000);
        
        //Display scene 1 at first
        window.setScene(scene2);
        window.setTitle("Title Here");
        window.show();
    }

}


	

