package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class UserScreenController {
    @FXML
    private ChoiceBox txtCurrentGroup;
    @FXML
    private LocalDate txtDateFilter;
    @FXML
    private ChoiceBox txtSelectedGroup;
    @FXML
    private  ChoiceBox txtPriorityLevel;
    @FXML
    private TextField txtTitle;
    @FXML
    private TextArea txtBody;



    public void handleDisplayBtn() throws Exception {}

    public void handleClearBtn() throws Exception {}

    public void handleSendBtn() throws Exception {}



}
