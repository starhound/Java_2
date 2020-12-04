//Wesley Reid
//COP 2251 - Java Programming 2
//Chapter 16 - Problem 1

package wesley16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ProgramOne extends Application {
	private Rectangle rectangle = new Rectangle(50, 25);
	private Circle circle = new Circle(50);
	private Ellipse ellipse = new Ellipse(50, 25);
	private StackPane pane = new StackPane();
	private RadioButton buttonCircle = new RadioButton("Circle");
	private RadioButton buttonRectangle = new RadioButton("Rectangle");
	private RadioButton buttonEllipse = new RadioButton("Ellipse");
	private CheckBox filled = new CheckBox("Fill");
	
	public void start(Stage primaryStage) {
		ToggleGroup group = new ToggleGroup();
		buttonCircle.setToggleGroup(group);
		buttonRectangle.setToggleGroup(group);
		buttonEllipse.setToggleGroup(group);
		buttonCircle.setOnAction(e -> drawCircle());
		buttonRectangle.setOnAction(e -> drawRectangle());
		buttonEllipse.setOnAction(e -> drawEllipse());
		HBox box = new HBox();
		box.setAlignment(Pos.BOTTOM_CENTER);
		box.getChildren().addAll(buttonCircle, buttonRectangle, buttonEllipse, filled);	
		pane.getChildren().add(box);	
		Scene scene = new Scene(pane, 600, 500);
		primaryStage.setTitle("Shape Placer");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
	
	//check for fill, remove other shapes if present, repeat
	private void drawCircle() {
		if(filled.isSelected()) {
			circle.setFill(Color.BLACK);
		}
		else 
		{
			circle.setFill(Color.TRANSPARENT);
			circle.setStroke(Color.BLACK);
			circle.setStrokeWidth(5);
		}
		pane.getChildren().remove(ellipse);
		pane.getChildren().remove(rectangle);
		pane.getChildren().add(circle);		 
	}
	
	private void drawRectangle() {
		if(filled.isSelected()) {
			rectangle.setFill(Color.BLACK);
		} 
		else 
		{
			rectangle.setFill(Color.TRANSPARENT);
			rectangle.setStroke(Color.BLACK);
			rectangle.setStrokeWidth(5);
		}
		pane.getChildren().remove(ellipse);
		pane.getChildren().remove(circle);
		pane.getChildren().add(rectangle);
	}
	
	private void drawEllipse() {
		if(filled.isSelected()) {
			ellipse.setFill(Color.BLACK);
		} 
		else 
		{
			ellipse.setFill(Color.TRANSPARENT);
			ellipse.setStroke(Color.BLACK);
			ellipse.setStrokeWidth(5);
		}
		pane.getChildren().remove(circle);
		pane.getChildren().remove(rectangle);
		pane.getChildren().add(ellipse);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
