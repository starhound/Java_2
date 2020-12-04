//Wesley Reid
//COP 2251 - Java 2
//Chapter 14 - Problem 16

package application;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Program2 extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	
	GridPane pane = new GridPane();
	pane.autosize();
	Rectangle r1 = new Rectangle(100, 100, 100, 100);
	r1.setStyle("-fx-fill: transparent; -fx-stroke: black; -fx-stroke-width: 5; -fx-border-right-color: solid");
	Rectangle r2 = new Rectangle(100, 100, 100, 100);
	r2.setStyle("-fx-fill: transparent; -fx-stroke: black; -fx-stroke-width: 5;");
	Rectangle r3 = new Rectangle(100, 100, 100, 100);
	r3.setStyle("-fx-fill: transparent; -fx-stroke: black; -fx-stroke-width: 5;");
	Rectangle r4 = new Rectangle(100, 100, 100, 100);
	r4.setStyle("-fx-fill: transparent; -fx-stroke: black; -fx-stroke-width: 5;");
	Rectangle r5 = new Rectangle(100, 100, 100, 100);
	r5.setStyle("-fx-fill: transparent; -fx-stroke: black; -fx-stroke-width: 5;");
	Rectangle r6 = new Rectangle(100, 100, 100, 100);
	r6.setStyle("-fx-fill: transparent; -fx-stroke: black; -fx-stroke-width: 5;");
	Rectangle r7 = new Rectangle(100, 100, 100, 100);
	r7.setStyle("-fx-fill: transparent; -fx-stroke: black; -fx-stroke-width: 5;");
	Rectangle r8 = new Rectangle(100, 100, 100, 100);
	r8.setStyle("-fx-fill: transparent; -fx-stroke: black; -fx-stroke-width: 5;");
	Rectangle r9 = new Rectangle(100, 100, 100, 100);
	r9.setStyle("-fx-fill: transparent; -fx-stroke: black; -fx-stroke-width: 5;");
	
	pane.add(r1, 0, 1);
	pane.add(r2, 1, 0);
	
	pane.add(r3, 0, 0);
	pane.add(r4, 1, 1);
	
	pane.add(r5, 0, 2);
	pane.add(r6, 1, 2);
	
	pane.add(r7, 2, 1);
	pane.add(r8, 2, 2);
	
	pane.add(r9, 2, 0);
    
	Scene scene = new Scene(pane);


	    primaryStage.setScene(scene);
	    primaryStage.setTitle("JavaFX App");

	    primaryStage.show();
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 