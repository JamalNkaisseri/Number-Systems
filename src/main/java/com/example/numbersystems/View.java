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
import javafx.stage.Stage;

import java.io.IOException;

public class View extends Application {

    ComboBox<String> conversionComboBox;

    TextField decimalTextField;
    TextField binaryTextField;
    TextField octalTextField;
    TextField hexadecimalTextField;
    TextField convertedTextField;

    Button decimalToBinaryButton;
    Button decimalToOctalButton;
    Button decimalToHexadecimalButton;
    Button convertButton;

    Label decimalLabel,
          binaryLabel,
          hexadecimalLabel,
          octalLabel,
          conversionLabel,
          convertedLabel
    ;

    @Override
    public void start(Stage stage) throws IOException {


        // Create UI elements
        decimalLabel = new Label("Decimal");
        decimalTextField = new TextField();
        decimalToBinaryButton = new Button("Decimal to Binary");

        conversionLabel = new Label("Conversion");
        conversionComboBox = new ComboBox<>();
        conversionComboBox.getItems().addAll("Binary","Octal","Hexadecimal");

        convertButton = new Button("Convert");

        convertedLabel = new Label("Converted");
        convertedTextField = new TextField();
        convertedTextField.setEditable(false);

        // Create layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        // Add elements to the layout
        grid.add(decimalLabel, 0, 0);
        grid.add(decimalTextField, 1, 0);
        grid.add(conversionLabel, 0, 1);
        grid.add(conversionComboBox, 1, 1);
        grid.add(convertButton, 2, 1);
        grid.add(convertedLabel, 0, 2);
        grid.add(convertedTextField, 1, 2);


        Scene scene = new Scene(grid, 300, 300);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
