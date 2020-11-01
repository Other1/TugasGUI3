/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Another
 */
public class FormEvent extends Application {
    @Override
    public void start(Stage stage){
        Text t1 = new Text("Name:");
        Text t2 = new Text("Phone:");
        Text t3 = new Text("Addres:");
        
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        tf3.setPrefSize(50, 75);
        
        Button b1 = new Button("Clear");
        Button b2 = new Button("Submit");
        
        b1.setOnAction(value -> {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        });
        
        b2.setOnAction((ActionEvent event) -> {
            Label l1= new Label("Your Data Has Been Submited");
            
            StackPane scene2 = new StackPane();
            scene2.getChildren().add(l1);
            
            Scene s2 = new Scene (scene2, 320,100);
            
            Stage window2 = new Stage();
            window2.setTitle("Thank You For Registering");
            window2.setScene(s2);
            
            window2.setX(515);
            window2.setY(250);
            
            window2.show();     
        });

        GridPane gp = new GridPane();
        gp.setMinSize(350, 250);
        gp.setVgap(5);
        gp.setHgap(5);
        gp.setAlignment(Pos.CENTER);
        
        gp.add(t1, 0, 0);
        gp.add(tf1, 1, 0);
        gp.add(t2, 0, 1);
        gp.add(tf2, 1, 1);
        gp.add(t3, 0, 2);
        gp.add(tf3, 1, 2);
        gp.add(b1, 0, 3);
        gp.add(b2, 1, 3);
        
        Scene scene = new Scene(gp);
        
        stage.setTitle("BattleField Event Registration");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}
