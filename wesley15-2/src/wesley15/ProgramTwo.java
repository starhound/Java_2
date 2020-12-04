package wesley15;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;

public class ProgramTwo extends Application {
	private TextArea investAmount = new TextArea();
	private TextArea yearsAmount = new TextArea();
	private TextArea interestAmount = new TextArea();
	private TextArea futureAmount = new TextArea();
	private Button calculate = new Button("Calculate");
	
	public void start(Stage primaryStage) {
		GridPane pane = new GridPane();
		pane.setHgap(5);
		pane.setVgap(5);
		pane.add(new Label("Investment Amount: "), 0, 0);
		pane.add(investAmount, 1, 0);
		pane.add(new Label("Number of Years: "), 0, 1);
		pane.add(yearsAmount, 1, 1);
		pane.add(new Label("Annual Interest Rate: "), 0, 2);
		pane.add(interestAmount, 1, 2);
		pane.add(new Label("Future Amount: "), 0, 3);
		pane.add(futureAmount, 1, 3);
		
		pane.add(calculate, 1, 4);
		
		pane.setAlignment(Pos.CENTER);
		futureAmount.setEditable(false);
		
		GridPane.setHalignment(calculate, HPos.RIGHT);
		
		calculate.setOnAction(e -> calculateInvestment());
		
		Scene scene = new Scene(pane, 800, 250);
		primaryStage.setTitle("Investment Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void calculateInvestment() {
		try {
			double investedAmount = Double.parseDouble(investAmount.getText());
			int yearsInvested = Integer.parseInt(yearsAmount.getText());
			double interestRate = Double.parseDouble(interestAmount.getText());
			
			int months = (int)yearsInvested * 12;
			//same formula in the textbook but im getting wildly different test results?
			double futureVal = investedAmount * Math.pow((1 + interestRate), months);
			
			futureAmount.setText(String.format("$%.2f", futureVal));
		}
		catch(Exception ex) {
			futureAmount.setText("Error with input");
		}
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
