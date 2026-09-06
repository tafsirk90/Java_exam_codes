package org.example.lab_7;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    public static void main(String[] args){
        launch(args);
    }
    TextField amount = new TextField();
    TextField rate = new TextField();
    TextField years = new TextField();
    Label monthly = new Label();
    public void start(Stage stage){
        GridPane grid = new GridPane();
        grid.add(new Label("Loan Amount :") ,0, 0);
        grid.add(amount, 1, 0);
        grid.add(new Label("Interest rate :") ,0, 1);
        grid.add(rate, 1, 1);
        grid.add(new Label("Years :") ,0, 2);
        grid.add(years, 1, 2);
        Button btn = new Button("Calculate");
        grid.add(btn, 1, 3);
        grid.add(new Label("Monthly :"), 0, 4);
        grid.add(monthly, 1, 4);
        btn.setOnAction(e -> {
           double total = Double.parseDouble(amount.getText());
           double interestRate = Double.parseDouble(rate.getText());
           double monthlyRate = (interestRate / 12) / 100;
           int year = Integer.parseInt(years.getText());
           int month = year * 12;
           double installment = total *(monthlyRate * Math.pow(1+monthlyRate, month))/(Math.pow(1+monthlyRate, month)-1);
           monthly.setText(String.format("%.2f", installment));
        });
        Scene scene = new Scene(grid, 300, 250);
        stage.setScene(scene);
        stage.show();
    }
}