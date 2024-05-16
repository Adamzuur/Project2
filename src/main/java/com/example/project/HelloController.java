package com.example.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button loginButton;

    @FXML
    private Button registrerenButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField gebruikersnaamTextfield;

    @FXML
    private Label foutmeldingLabel;

    public void initialize() {
        // Set the preferred size of the AnchorPane
        anchorPane.setPrefSize(800, 600);

        // Set the maximum size of the AnchorPane
        anchorPane.setMaxSize(800, 600);

        // Set the minimum size of the AnchorPane
        anchorPane.setMinSize(800, 600);
    }
}