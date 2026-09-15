package com.mycompany.lab4_harelrajendram;

import static java.lang.Double.parseDouble;
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
        
       
        grid.add(new Label("Number of days on the trip:"), 0, 0);
        grid.add(NumdaysTrip, 1, 0);

        grid.add(new Label("Amount of airfare $:"), 0, 1);
        grid.add(airfare, 1, 1);

        grid.add(new Label("Car rental fees $:"), 0, 2);
        grid.add(carRentalFee, 1, 2);

        grid.add(new Label("Miles driven (private vehicle):"), 0, 3);
        grid.add(miles, 1, 3);

        grid.add(new Label("Parking fees $:"), 0, 4);
        grid.add(parkingFees, 1, 4);

        grid.add(new Label("Taxi charges $:"), 0, 5);
        grid.add(taxiCharge, 1, 5);

        grid.add(new Label("Conference/Seminar fees $:"), 0, 6);
        grid.add(registrationFees, 1, 6);

        grid.add(new Label("Lodging charges (per night) $:"), 0, 7);
        grid.add(lodgingCharge, 1, 7);
        
        calculator.setOnAction(e -> calculateExpenses());
        
        
        Scene scene = new Scene(grid, 500, 400);
        stage.setTitle("Travel Expense Calculator");
        stage.setScene(scene);
       
        stage.show();
    }
    private void calculateExpenses() {
        int days = Integer.parseInt(NumdaysTrip.getText());
        if (days <= 0) {
        System.out.println("Wrong amount of days inputted");
        }
        
        double airfaire = Double.parseDouble(airfare.getText());
        double carFee = Double.parseDouble(carRentalFee.getText());
        double doubleMiles = Double.parseDouble(miles.getText());
        double doubleParkingFees = Double.parseDouble(parkingFees.getText());
        double lodging = parseDouble(lodgingCharge.getText());
        double conference = parseDouble(registrationFees.getText());
        double doubleTaxi = parseDouble(taxiCharge.getText());
       
        
        double totalExpenses = airfaire + carFee + (doubleMiles * 0.27) + doubleParkingFees 
                + doubleTaxi + conference + (lodging * days);
        
        double mealExpenses = 37 * days;
        double parkingExpenses = Math.min(doubleParkingFees, 10.0 * days);;
        double taxiExpenses = Math.min(doubleTaxi, 20 * days);
        double lodgingExpenses = Math.min(lodging, 95 * days);
        
        
    }

    public static void main(String[] args) {
        launch();
    }

}