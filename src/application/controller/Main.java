package application.controller;

import application.model.MailingListModel;
import application.model.Message;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    static AnchorPane root;
    static List<AnchorPane> anchor = new ArrayList<AnchorPane>();
    private static int sceneIndex = 0;
    public static MailingListModel mailingList;
    public static Message currentMessage = null;

    @Override
    public void start(Stage primaryStage) throws Exception{
        mailingList = new MailingListModel();
        //mailingList.loadFromFiles();

        root = (AnchorPane)FXMLLoader.load(getClass().getResource("../view/HomeScreen.fxml"));


        anchor.add((AnchorPane)FXMLLoader.load(getClass().getResource("../view/HomeScreen.fxml")));//0
        anchor.add((AnchorPane)FXMLLoader.load(getClass().getResource("../view/UserScreen.fxml")));//1
        anchor.add((AnchorPane)FXMLLoader.load(getClass().getResource("../view/AdminScreen.fxml")));//2
        anchor.add((AnchorPane)FXMLLoader.load(getClass().getResource("../view/MessageDisplay.fxml")));//3
        root.getChildren().add(anchor.get(0));

        primaryStage.setTitle("Game Mailing List");
        primaryStage.setScene(new Scene(root, 680, 300));
        primaryStage.show();
    }

    public  static AnchorPane get_pane(int index){
        return anchor.get(index);
    }

    public static void set_pane(int index){
        root.getChildren().remove(anchor.get(sceneIndex));
        root.getChildren().add(anchor.get(index));
        sceneIndex=index;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
