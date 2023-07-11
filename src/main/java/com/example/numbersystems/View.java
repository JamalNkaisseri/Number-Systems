package com.example.numbersystems;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class View extends Application {

    TextField inputTextField;

    Label decimalLabel,
          binaryLabel,
          hexadecimalLabel,
          octalLabel
    ;

    @Override
    public void start(Stage stage) throws IOException {

        inputTextField = new TextField();
        inputTextField.setPromptText("Enter a number");
        inputTextField.setPrefWidth(5);
        inputTextField.setStyle("-fx-prompt-text-fill: #FF0000;");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(inputTextField);

        Scene scene = new Scene(layout, 300, 300);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }
}
