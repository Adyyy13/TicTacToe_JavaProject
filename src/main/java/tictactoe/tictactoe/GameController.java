package tictactoe.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class GameController {

    @FXML
    private Stage stage;
    private Scene scene;
    private FXMLLoader fxmlloader;
    @FXML
    protected void onBackButtonClick(ActionEvent actionEvent) throws IOException {

        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onB0ButtonClick(ActionEvent actionEvent) {


    }

    @FXML
    protected void onB1ButtonClick(ActionEvent actionEvent) {
    }

    @FXML
    protected void onB2ButtonClick(ActionEvent actionEvent) {
    }

    @FXML
    protected void onB3ButtonClick(ActionEvent actionEvent) {
    }
    @FXML
    protected void onB4ButtonClick(ActionEvent actionEvent) {
    }
    @FXML
    protected void onB5ButtonClick(ActionEvent actionEvent) {
    }
    @FXML
    protected void onB6ButtonClick(ActionEvent actionEvent) {
    }
    @FXML
    protected void onB7ButtonClick(ActionEvent actionEvent) {
    }
    @FXML
    protected void onB8ButtonClick(ActionEvent actionEvent) {
    }
}
