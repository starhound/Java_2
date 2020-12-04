//Wesley Reid
//COP 2251 - Java 2
//Chapter 14 - Problem 16

package wesley14;
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ProgramTwo extends Application {
	
	public Rectangle rectangle() {
		Rectangle rect = new Rectangle(100, 100, 100, 100);
		rect.setStyle("-fx-fill: transparent; -fx-stroke: red; -fx-stroke-width: 5; -fx-border-right-color: solid");
		return rect;
	}
	
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	
	GridPane pane = new GridPane();
	pane.autosize();
	pane.setGridLinesVisible(true);
	
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			pane.add(rectangle(), j, i);
		}
	}
    
	Scene scene = new Scene(pane);
    primaryStage.setScene(scene);
    primaryStage.setTitle("JavaFX App");
    primaryStage.show();
  }
  
  public static void main(String[] args) {
    launch(args);
  }
} 