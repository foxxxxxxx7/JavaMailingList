package application.controller;

import application.model.MailingListModel;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class HomeScreenController
{
    @FXML
    private TextField txtEmailAddressReg;
    @FXML
    private TextField txtUsernameReg;
    @FXML
    private TextField txtPasswordReg;
    @FXML
    private ChoiceBox txtInitialGroup;

    @FXML
    private TextField txtUsernameLog;
    @FXML
    private TextField txtPasswordLog;


    public void handleRegisterBtn() throws Exception {

        String emailAddress = txtEmailAddressReg.getText();
        String username = txtUsernameReg.getText();
        String password = txtPasswordReg.getText();
        String initialGroup = txtInitialGroup.getAccessibleText();
        Main.mailingList.register(emailAddress, username, password, initialGroup);
    }
    public void handleUserLoginBtn() throws Exception {

        Main.set_pane(1);

    }

    public void handleAdminLoginBtn() throws Exception {
        Main.set_pane(2);

    }


}
