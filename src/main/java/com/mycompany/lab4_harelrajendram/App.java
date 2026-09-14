package com.mycompany.lab4_harelrajendram;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    private TextField NumdaysTrip;
        private TextField airfare ;
        private TextField carRentalFee;
        private TextField miles;
        private TextField parkingFees;
        private TextField taxiCharge;
        private TextField registrationFees;
        private TextField lodgingCharge;

    @Override
    public void start(Stage stage) {
    
        NumdaysTrip = new TextField();
        airfare = new TextField();
        carRentalFee = new TextField();
        miles = new TextField();
        parkingFees = new TextField();
        taxiCharge = new TextField();
        registrationFees = new TextField(); 
        lodgingCharge = new TextField();
        
        Label NumdaysTrip = new Label("Number of days on the trip:");
        
        stage.setScene(scene);
       
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}