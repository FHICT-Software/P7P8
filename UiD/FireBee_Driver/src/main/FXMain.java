/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Jeroen
 */
public class FXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        new MapFrame().setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
