//Wesley Reid
//COP 2251 - Java Programming 2
//Chapter 15 - Problem 2

package application;
	
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
 
public class Main extends Application {
	private Button calculate = new Button("Rotate");
	private Rectangle rectangle = new Rectangle();
	private int rotation = 0;
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setHgap(5);
		pane.setVgap(5);
		
		rectangle.setHeight(40);
		rectangle.setWidth(20);
		
		pane.add(calculate, 1, 4);
		pane.add(rectangle, 1, 1);
		
		pane.setAlignment(Pos.CENTER);
		
		GridPane.setHalignment(calculate, HPos.RIGHT);
		
		calculate.setOnAction(e -> rotateRectangle());
		
		Scene scene = new Scene(pane, 400, 250);
		primaryStage.setTitle("Rotate Rectangle");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void rotateRectangle() {
		rotation += 15;
		rectangle.setRotate(rotation);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
