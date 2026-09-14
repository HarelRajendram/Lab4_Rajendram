package com.mycompany.lab4_harelrajendram;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    private TextField NumdaysTrip = new TextField();
        private TextField airfare = new TextField();
        private TextField carRentalFee = new TextField();
        private TextField miles = new TextField();
        private TextField parkingFees = new TextField();
        private TextField taxiCharge = new TextField();
        private TextField registrationFees = new TextField();
        private TextField lodgingCharge = new TextField();
        
        private Label totalExpense = new Label("0.00$");
        private Label AllowableExpense = new Label("0.00$");
        private Label ExcessExpense = new Label("0.00$");
        private Label SavedExpense = new Label("0.00$");
        

    @Override
    public void start(Stage stage) {
        
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20));
    
        NumdaysTrip = new TextField();
        airfare = new TextField();
        carRentalFee = new TextField();
        miles = new TextField();
        parkingFees = new TextField();
        taxiCharge = new TextField();
        registrationFees = new TextField(); 
        lodgingCharge = new TextField();
        Button calculator = new Button("Calculate");
        
        Label NumdaysTrip = new Label("Number of days on the trip:");
        
        stage.setScene(scene);
       
        stage.show();
    }
    private void calculateExpenses() {
        double airfaire = Double.parseDouble(airfare.getText());
        double carFee = Double.parseDouble(carRentalFee.getText());
        
        
    }

    public static void main(String[] args) {
        launch();
    }

}