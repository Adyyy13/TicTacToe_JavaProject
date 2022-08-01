package tictactoe.tictactoe;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {
    @FXML
    private Label welcomeText;
    private Stage stage;
    private Scene scene;
    private FXMLLoader fxmlloader;

    @FXML
    protected void onExitButtonClick(ActionEvent actionEvent) throws IOException {
        Platform.exit();
    }

    @FXML
    public void onStartGameButtonClick(ActionEvent actionEvent) throws IOException {

        stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Game.fxml"));
        Scene game = new Scene(fxmlLoader.load(), 400, 500);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(game);
        stage.show();
    }

}



