package com.example.numbersystems;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class View extends Application {

    TextField inputTextField;
    TextField outputTextField;

    Button button;

    Label decimalLabel,
          binaryLabel,
          hexadecimalLabel,
          octalLabel
    ;

    @Override
    public void start(Stage stage) throws IOException {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(10);

        inputTextField = new TextField();
        inputTextField.setPromptText("Enter a number");
        inputTextField.setPrefWidth(150);
        inputTextField.setAlignment(Pos.CENTER_LEFT);
        inputTextField.setStyle("-fx-prompt-text-fill: #000000;");

        ComboBox <String> comboBox = new ComboBox<>();
        comboBox.setItems(FXCollections.observableArrayList("Decimal","Binary","Hexadecimal","Octal"));
        comboBox.setPromptText("Select an option");
        GridPane.setConstraints(comboBox,0,1);


        button = new Button("Convert");
        GridPane.setConstraints(button,0,2);

        grid.getChildren().addAll(inputTextField,button,comboBox);

        Scene scene = new Scene(grid, 300, 300);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
