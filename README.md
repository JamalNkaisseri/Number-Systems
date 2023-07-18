
# Number System Converter

The Number System Converter is a JavaFX application that allows you to convert numbers between different number systems, such as decimal, binary, octal, and hexadecimal.

## Getting Started

To run the Number System Converter on your computer, follow these steps:

### Prerequisites

- Java Development Kit (JDK) 8 or higher installed on your computer.
- Make sure the `java` command is available in your system's PATH.

### Obtaining the JAR File

1. Go to the [project repository](https://github.com/your-username/number-system-converter) on GitHub.
2. Click on the green "Code" button and select "Download ZIP" to download the project's source code.
3. Extract the downloaded ZIP file to a directory of your choice.

### Running the Application

1. Open a command prompt (Windows) or terminal (macOS/Linux) and navigate to the directory where you extracted the project.
2. Compile the source code by running the following command:
   ```
   javac --module-path <path-to-javafx-sdk>/lib --add-modules javafx.controls,javafx.fxml *.java
   ```
   Replace `<path-to-javafx-sdk>` with the actual path to your JavaFX SDK installation directory.
3. Once the compilation is successful, run the application using the following command:
   ```
   java --module-path <path-to-javafx-sdk>/lib --add-modules javafx.controls,javafx.fxml Main
   ```
   Again, replace `<path-to-javafx-sdk>` with the actual path to your JavaFX SDK installation directory.
4. The Number System Converter application should now open and be ready to use.

## How to Use

1. Enter a number in the desired number system (decimal, binary, octal, or hexadecimal) in the corresponding field.
2. Select the target number system from the dropdown menu.
3. The converted number will be displayed in real-time as you type.

## License

This project is licensed under the [MIT License](LICENSE).



