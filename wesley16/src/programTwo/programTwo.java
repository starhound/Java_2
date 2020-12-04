//Wesley Reid
//COP 2251 - Java Programming 2
//Chapter 16 - Problem 4

package programTwo;
	
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class programTwo extends Application {
	private TextArea miles = new TextArea();
	private TextArea kilometers = new TextArea();
	private double MILES_TO_KM = 1.60934;
	private double KM_TO_MILES = 0.621371;
	
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		pane.setHgap(2);
		pane.setVgap(2);
		
		pane.add(new Label("Miles: "), 0, 0);
		pane.add(miles, 1, 0);
		pane.add(new Label("Kilometers: "), 0, 1);
		pane.add(kilometers, 1, 1);
		
		pane.setAlignment(Pos.CENTER);
		
		miles.setOnKeyPressed(event -> {
			   if(event.getCode() == KeyCode.ENTER){
				   double milesEntered = Double.parseDouble(miles.getText());
				   double milesToKm = milesEntered * MILES_TO_KM;
				   kilometers.setText(Double.toString(milesToKm));
			   }
			}); 
			
		kilometers.setOnKeyPressed(event -> {
			   if(event.getCode() == KeyCode.ENTER){
				   double kilometersEntered = Double.parseDouble(kilometers.getText());
				   double kmToMiles = kilometersEntered * KM_TO_MILES;
				   miles.setText(Double.toString(kmToMiles));
			   }
			}); 
			
		Scene scene = new Scene(pane, 600, 250);
		primaryStage.setTitle("Investment Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
