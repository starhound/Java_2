//Wesley Reid
//COP 2251 - Java 2
//Chapter 14 - Problem 1

package application;
	
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
	  
    // Create a pane and set its properties
    GridPane pane = new GridPane();
    
    pane.setAlignment(Pos.CENTER);
    pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
    pane.setHgap(5.5);
    pane.setVgap(5.5);
    
    //grab dir for images
    String localDir = System.getProperty("user.dir") + "\\src";
    
    //initialize
    FileInputStream input1 = null;
    
    //attempt to grab file 
	try {
		File file1 = new File(localDir + "\\2.png");
		input1 = new FileInputStream(file1);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    FileInputStream input2 = null;
    
	try {
		File file2 = new File(localDir + "\\3.png");
		input2 = new FileInputStream(file2);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    FileInputStream input3 = null;
    
	try {
		File file3 = new File(localDir + "\\4.png");
		input3 = new FileInputStream(file3);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    FileInputStream input4 = null;
    
	try {
		File file4 = new File(localDir + "\\5.png");
		input4 = new FileInputStream(file4);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	//create image class from files
    Image image1 = new Image(input1);
    Image image2 = new Image(input2);
    Image image3 = new Image(input3);
    Image image4 = new Image(input4);
    
    //create imageviews from images
    ImageView imageView1 = new ImageView(image1);
    ImageView imageView2 = new ImageView(image2);
    ImageView imageView3 = new ImageView(image3);
    ImageView imageView4 = new ImageView(image4);
    
    //post imageviews into pane
    pane.add(imageView1, 0, 0);
    pane.add(imageView2, 0, 1);
    pane.add(imageView3, 1, 0);
    pane.add(imageView4, 1, 1);
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowGridPane"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
} 