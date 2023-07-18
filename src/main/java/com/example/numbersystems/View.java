package com.example.numbersystems;

import javafx.application.Application;
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

    Logic logic = new Logic();

    ComboBox<String> decimalConversionComboBox;
    ComboBox<String> binaryConversionComboBox;
    ComboBox<String> octalConversionComboBox;
    ComboBox<String> hexadecimalConversionComboBox;

    TextField decimalTextField;
    TextField binaryTextField;
    TextField octalTextField;
    TextField hexadecimalTextField;
    TextField decimalConvertedTextField;
    TextField binaryConvertedTextField;
    TextField octalConvertedTextField;
    TextField hexadecimalConvertedTextField;



    Button decimalConvertButton;
    Button binaryConvertButton;
    Button octalConvertButton;
    Button hexadecimalConvertButton;

    Label decimalLabel,
          binaryLabel,
          hexadecimalLabel,
          hexadecimalConvertedLabel,
          hexadecimalConversionLabel,
          octalLabel,
          octalConvertedLabel,
          octalConversionLabel,
          decimalConversionLabel,
          decimalConvertedLabel,
          binaryConversionLabel,
          binaryConvertedLabel

    ;

    @Override
    public void start(Stage stage) throws IOException {


        // Create decimal UI elements
        decimalLabel = new Label("Decimal");
        decimalTextField = new TextField();


        decimalConversionLabel = new Label("Conversion");
        decimalConversionComboBox = new ComboBox<>();
        decimalConversionComboBox.getItems().addAll("Binary","Octal","Hexadecimal");

        decimalConvertButton = new Button("Convert");
        decimalConvertButton.setOnAction(actionEvent -> {
            String selectedOperation = decimalConversionComboBox.getValue();

            if(selectedOperation.equals("Binary")){
                logic.decToBinary(decimalTextField,decimalConvertedTextField);
            }

            if(selectedOperation.equals("Octal")){
                logic.decToOctal(decimalTextField,decimalConvertedTextField);
            }

            if(selectedOperation.equals("Hexadecimal")){
                logic.decToHexadecimal(decimalTextField,decimalConvertedTextField);
            }
        });

        decimalConvertedLabel = new Label("Converted");
        decimalConvertedTextField = new TextField();
        decimalConvertedTextField.setEditable(false);

        // Create binary UI elements
        binaryLabel = new Label("Binary");
        binaryTextField = new TextField();

        binaryConversionLabel =  new Label("Conversion");
        binaryConversionComboBox = new ComboBox<>();
        binaryConversionComboBox.getItems().addAll("Decimal","Octal","Hexadecimal");

        binaryConvertButton = new Button("Convert");
        binaryConvertButton.setOnAction(actionEvent -> {

            String selectedOperation = binaryConversionComboBox.getValue();

            if(selectedOperation.equals("Decimal")){
                logic.binaryToDec(binaryTextField,binaryConvertedTextField);
            }

            if(selectedOperation.equals("Octal")){
                logic.binaryToOctal(binaryTextField,binaryConvertedTextField);
            }

            if(selectedOperation.equals("Hexadecimal")){
                logic.binaryToHexadecimal(binaryTextField,binaryConvertedTextField);
            }
        });

        binaryConvertedLabel =  new Label("Converted");
        binaryConvertedTextField = new TextField();
        binaryConvertedTextField.setEditable(false);

        // Create octal UI elements
        octalLabel = new Label("Octal");
        octalTextField = new TextField();

        octalConversionLabel = new Label("Conversion");
        octalConversionComboBox = new ComboBox<>();
        octalConversionComboBox.getItems().addAll("Decimal","Binary","Hexadecimal");

        octalConvertButton = new Button("Convert");
        octalConvertButton.setOnAction(actionEvent -> {

            String selectedOperation = octalConversionComboBox.getValue();

            if(selectedOperation.equals("Decimal")){
                logic.octalToDecimal(octalTextField,octalConvertedTextField);
            }

            if(selectedOperation.equals("Binary")){
                logic.octalToBinary(octalTextField,octalConvertedTextField);
            }

            if(selectedOperation.equals("Hexadecimal")){
                logic.octalToHexadecimal(octalTextField,octalConvertedTextField);
            }
        });

        octalConvertedLabel = new Label("Converted");
        octalConvertedTextField = new TextField();
        octalConvertedTextField.setEditable(false);

        // Create hexadecimal UI elements
        hexadecimalLabel = new Label("Hexadecimal");
        hexadecimalTextField = new TextField();

        hexadecimalConversionLabel = new Label("Conversion");
        hexadecimalConversionComboBox = new ComboBox<>();
        hexadecimalConversionComboBox.getItems().addAll("Decimal","Binary","Octal");

        hexadecimalConvertButton = new Button("Convert");
        hexadecimalConvertButton.setOnAction(actionEvent -> {

            String selectedOperation = hexadecimalConversionComboBox.getValue();

            if(selectedOperation.equals("Decimal")){
                logic.hexadecimalToDecimal(hexadecimalTextField,hexadecimalConvertedTextField);
            }

            if(selectedOperation.equals("Binary")){
                logic.hexadecimalToBinary(hexadecimalTextField,hexadecimalConvertedTextField);
            }

            if(selectedOperation.equals("Octal")){
                logic.hexadecimalToOctal(hexadecimalTextField,hexadecimalConvertedTextField);
            }
        });

        hexadecimalConvertedLabel = new Label("Converted");
        hexadecimalConvertedTextField = new TextField();
        hexadecimalConvertedTextField.setEditable(false);


        // Create layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);

        // Add decimal elements to the layout
        grid.add(decimalLabel, 0, 0);
        grid.add(decimalTextField, 1, 0);
        grid.add(decimalConversionLabel, 0, 1);
        grid.add(decimalConversionComboBox, 1, 1);
        grid.add(decimalConvertButton, 2, 1);
        grid.add(decimalConvertedLabel, 0, 2);
        grid.add(decimalConvertedTextField, 1, 2);

        // Add binary elements to the layout
        grid.add(binaryLabel,0,4);
        grid.add(binaryTextField,1,4);
        grid.add(binaryConversionLabel,0,5);
        grid.add(binaryConversionComboBox,1,5);
        grid.add(binaryConvertButton,2,5);
        grid.add(binaryConvertedLabel,0,6);
        grid.add(binaryConvertedTextField,1,6);

        // Add octal elements to the layout
        grid.add(octalLabel,0,8);
        grid.add(octalTextField,1,8);
        grid.add(octalConversionLabel,0,9);
        grid.add(octalConversionComboBox,1,9);
        grid.add(octalConvertButton,2,9);
        grid.add(octalConvertedLabel,0,10);
        grid.add(octalConvertedTextField,1,10);

        // Add hexadecimal elements to the layout
        grid.add(hexadecimalLabel,0,12);
        grid.add(hexadecimalTextField,1,12);
        grid.add(hexadecimalConversionLabel,0,13);
        grid.add(hexadecimalConversionComboBox,1,13);
        grid.add(hexadecimalConvertButton,2,13);
        grid.add(hexadecimalConvertedLabel,0,14);
        grid.add(hexadecimalConvertedTextField,1,14);


        Scene scene = new Scene(grid, 600, 600);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
