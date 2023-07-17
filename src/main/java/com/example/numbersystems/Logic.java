package com.example.numbersystems;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Logic {

    public void decToBinary(TextField inputTextField,TextField outputTextField) {

        try {

            // Get the decimal value from the TextField
            int decimal = Integer.parseInt(inputTextField.getText());

            // Convert the decimal value to binary
            String binary = Integer.toBinaryString(decimal);

            // Update the TextField with the binary representation
            outputTextField.setText(binary);
        } catch (NumberFormatException e) {

            // Show an error message dialog to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid decimal value entered");
            alert.showAndWait();
        }

    }

    public void decToOctal(TextField inputTextField,TextField outputTextField){

        try{

            // Get the decimal value from the TextField
            int decimal = Integer.parseInt(inputTextField.getText());

            // Convert the decimal value to octal
            String octal = Integer.toOctalString(decimal);

            // Update the TextField with the octal representation
            outputTextField.setText(octal);

        } catch (NumberFormatException e){

            // Show an error message dialog to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid decimal value entered");
            alert.showAndWait();

        }
    }

    public void decToHexadecimal(TextField inputTextField,TextField outputTextField){

        try{

            // Get the decimal value from the TextField
            int decimal = Integer.parseInt(inputTextField.getText());

            // Convert the decimal value to hexadecimal
            String hexadecimal = Integer.toHexString(decimal);

            // Update the TextField with the hexadecimal representation
            outputTextField.setText(hexadecimal);

        } catch (NumberFormatException e){

            // Show an error message dialog to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid decimal value entered");
            alert.showAndWait();

        }
    }

    public void binaryToDec(TextField inputTextField,TextField outputTextField){

        try{

            // Get the binary value from the TextField
            String  binary = inputTextField.getText();

            // Convert the binary value to decimal
            int decimalValue = Integer.parseInt(binary, 2);

            // Update the TextField with the decimal representation
            outputTextField.setText(String.valueOf(decimalValue));

        } catch (NumberFormatException e){

            // Show an error message dialog to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid binary value entered");
            alert.showAndWait();

        }
    }

    public void binaryToOctal(TextField inputTextField,TextField outputTextField){

        try{

            // Get the binary value from the TextField
            String  binary = inputTextField.getText();

            // Convert the binary value to decimal
            int decimalValue = Integer.parseInt(binary, 2);

            // Convert the decimal value to octal
            String octal = Integer.toOctalString(decimalValue);

            // Update the TextField with the octal representation
            outputTextField.setText(octal);

        } catch (NumberFormatException e){

            // Show an error message dialog to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid binary value entered");
            alert.showAndWait();

        }
    }

    public void binaryToHexadecimal(TextField inputTextField,TextField outputTextField){

        try{

            // Get the binary value from the TextField
            String  binary = inputTextField.getText();

            // Convert the binary value to decimal
            int decimalValue = Integer.parseInt(binary, 2);

            // Convert the decimal value to Hexadecimal
            String hexadecimal = Integer.toHexString(decimalValue);

            // Update the TextField with the octal representation
            outputTextField.setText(hexadecimal);

        } catch (NumberFormatException e){

            // Show an error message dialog to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid binary value entered");
            alert.showAndWait();

        }
    }

    public void octalToDecimal(TextField inputTextField,TextField outputTextField){

        try{

            // Get the octal value from the TextField
            String octal = inputTextField.getText();

            // Convert the octal value to decimal
            int decimalValue = Integer.parseInt(octal,8);

            // Update the TextField with the decimal representation
            outputTextField.setText(String.valueOf(decimalValue));

        } catch (NumberFormatException e){

            // Show an error message dialog to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid octal value entered");
            alert.showAndWait();

        }
    }


    public void octalToBinary(TextField inputTextField,TextField outputTextField){

        try{

            // Get the octal value from the TextField
            String octal = inputTextField.getText();

            // Convert the octal value to decimal
            int decimalValue = Integer.parseInt(octal,8);

            // Convert the decimal value to binary
            String binary = Integer.toBinaryString(decimalValue);

            // Update the TextField with the binary representation
            outputTextField.setText(binary);

        } catch (NumberFormatException e){

            // Show an error message dialog to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid octal value entered");
            alert.showAndWait();

        }
    }

    public void octalToHexadecimal(TextField inputTextField,TextField outputTextField){

        try{

            // Get the octal value from the TextField
            String octal = inputTextField.getText();

            // Convert the octal value to decimal
            int decimalValue = Integer.parseInt(octal,8);

            // Convert the decimal value to hexadecimal
            String hexadecimal = Integer.toHexString(decimalValue);

            // Update the TextField with the hexadecimal representation
            outputTextField.setText(hexadecimal);

        } catch (NumberFormatException e){

            // Show an error message dialog to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid octal value entered");
            alert.showAndWait();

        }
    }

    public void hexadecimalToDecimal(TextField inputTextField,TextField outputTextField){

       try{

           // Get the hexadecimal value from the TextField
           String hexadecimal = inputTextField.getText();

           // Convert the hexadecimal value to decimal
           int decimalValue = Integer.parseInt(hexadecimal,16);

           // Update the TextField with the decimal representation
           outputTextField.setText(String.valueOf(decimalValue));

       } catch (NumberFormatException e){

           // Show an error message dialog to the user
           Alert alert = new Alert(AlertType.ERROR);
           alert.setTitle("Error");
           alert.setHeaderText(null);
           alert.setContentText("Invalid hexadecimal value entered");
           alert.showAndWait();
       }
    }

    public void hexadecimalToBinary(TextField inputTextField,TextField outputTextField){

        try{

            // Get the hexadecimal value from the TextField
            String hexadecimal = inputTextField.getText();

            // Convert the hexadecimal value to decimal
            int decimalValue = Integer.parseInt(hexadecimal,16);

            // Convert the decimal value to binary
            String binary = Integer.toBinaryString(decimalValue);

            // Update the TextField with the binary representation
            outputTextField.setText(binary);

        } catch (NumberFormatException e){

            // Show an error message dialog to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid hexadecimal value entered");
            alert.showAndWait();
        }
    }

    public void hexadecimalToOctal(TextField inputTextField,TextField outputTextField){

        try{

            // Get the hexadecimal value from the TextField
            String hexadecimal = inputTextField.getText();

            // Convert the hexadecimal value to decimal
            int decimalValue = Integer.parseInt(hexadecimal,16);

            // Convert the decimal value to octal
            String octal = Integer.toOctalString(decimalValue);

            // Update the TextField with the octal representation
            outputTextField.setText(octal);

        } catch (NumberFormatException e){

            // Show an error message dialog to the user
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid hexadecimal value entered");
            alert.showAndWait();
        }
    }

}
