package tictactoe.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class GameController extends Engine {

    @FXML
    protected void onBackButtonClick(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 500);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);
        stage.show();

        drawCheck = 0;
        line = null;

    }

    public Slider slider = null;

    public Text info = null;
    public Button B0 = null;
    public Button B1 = null;
    public Button B2 = null;
    public Button B3 = null;
    public Button B4 = null;
    public Button B5 = null;
    public Button B6 = null;
    public Button B7 = null;
    public Button B8 = null;

    @FXML
    protected void onB0ButtonClick() {
        if (slider.getValue() == 0.0) {
            B0.setText("O");
            slider.setValue(1.0);
            board[0] = "O";
        }     else {
            B0.setText("X");
            slider.setValue(0.0);
            board[0] = "X";
        }

        B0.setDisable(true);

        if (gameStateCheck().equals("X")) {
            info.setText("!!! X WON !!!");
        } else if (gameStateCheck().equals("O")) {
            info.setText("!!! O WON !!!");
        }
        else if (gameStateCheck().equals("draw")) {
            info.setText("!!! IT'S DRAW !!!");
        }

    }

    @FXML
    protected void onB1ButtonClick() {
        if (slider.getValue() == 0.0) {
            B1.setText("O");
            slider.setValue(1.0);
            board[1] = "O";
        }     else {
            B1.setText("X");
            slider.setValue(0.0);
            board[1] = "X";
        }

        B1.setDisable(true);

        if (gameStateCheck().equals("X")) {
            info.setText("!!! X WON !!!");
        } else if (gameStateCheck().equals("O")) {
            info.setText("!!! O WON !!!");
        }
        else if (gameStateCheck().equals("draw")) {
            info.setText("!!! IT'S DRAW !!!");
        }
    }

    @FXML
    protected void onB2ButtonClick() {
        if (slider.getValue() == 0.0) {
            B2.setText("O");
            slider.setValue(1.0);
            board[2] = "O";
        }     else {
            B2.setText("X");
            slider.setValue(0.0);
            board[2] = "X";
        }

        B2.setDisable(true);

        if (gameStateCheck().equals("X")) {
            info.setText("!!! X WON !!!");
        } else if (gameStateCheck().equals("O")) {
            info.setText("!!! O WON !!!");
        }
        else if (gameStateCheck().equals("draw")) {
            info.setText("!!! IT'S DRAW !!!");
        }
    }

    @FXML
    protected void onB3ButtonClick() {
        if (slider.getValue() == 0.0) {
            B3.setText("O");
            slider.setValue(1.0);
            board[3] = "O";
        }     else {
            B3.setText("X");
            slider.setValue(0.0);
            board[3] = "X";
        }

        B3.setDisable(true);

        if (gameStateCheck().equals("X")) {
            info.setText("!!! X WON !!!");
        } else if (gameStateCheck().equals("O")) {
            info.setText("!!! O WON !!!");
        }
        else if (gameStateCheck().equals("draw")) {
            info.setText("!!! IT'S DRAW !!!");
        }
    }
    @FXML
    protected void onB4ButtonClick() {
        if (slider.getValue() == 0.0) {
            B4.setText("O");
            slider.setValue(1.0);
            board[4] = "O";
        }     else {
            B4.setText("X");
            slider.setValue(0.0);
            board[4] = "X";
        }

        B4.setDisable(true);

        if (gameStateCheck().equals("X")) {
            info.setText("!!! X WON !!!");
        } else if (gameStateCheck().equals("O")) {
            info.setText("!!! O WON !!!");
        }
        else if (gameStateCheck().equals("draw")) {
            info.setText("!!! IT'S DRAW !!!");
        }
    }
    @FXML
    protected void onB5ButtonClick() {
        if (slider.getValue() == 0.0) {
            B5.setText("O");
            slider.setValue(1.0);
            board[5] = "O";
        }     else {
            B5.setText("X");
            slider.setValue(0.0);
            board[5] = "X";
        }

        B5.setDisable(true);

        if (gameStateCheck().equals("X")) {
            info.setText("!!! X WON !!!");
        } else if (gameStateCheck().equals("O")) {
            info.setText("!!! O WON !!!");
        }
        else if (gameStateCheck().equals("draw")) {
            info.setText("!!! IT'S DRAW !!!");
        }
    }
    @FXML
    protected void onB6ButtonClick() {
        if (slider.getValue() == 0.0) {
            B6.setText("O");
            slider.setValue(1.0);
            board[6] = "O";
        }     else {
            B6.setText("X");
            slider.setValue(0.0);
            board[6] = "X";
        }

        B6.setDisable(true);

        if (gameStateCheck().equals("X")) {
            info.setText("!!! X WON !!!");
        } else if (gameStateCheck().equals("O")) {
            info.setText("!!! O WON !!!");
        }
        else if (gameStateCheck().equals("draw")) {
            info.setText("!!! IT'S DRAW !!!");
        }
    }
    @FXML
    protected void onB7ButtonClick() {
        if (slider.getValue() == 0.0) {
            B7.setText("O");
            slider.setValue(1.0);
            board[7] = "O";
        }     else {
            B7.setText("X");
            slider.setValue(0.0);
            board[7] = "X";
        }

        B7.setDisable(true);

        if (gameStateCheck().equals("X")) {
            info.setText("!!! X WON !!!");
        } else if (gameStateCheck().equals("O")) {
            info.setText("!!! O WON !!!");
        }
        else if (gameStateCheck().equals("draw")) {
            info.setText("!!! IT'S DRAW !!!");
        }
    }
    @FXML
    protected void onB8ButtonClick() {
        if (slider.getValue() == 0.0) {
            B8.setText("O");
            slider.setValue(1.0);
            board[8] = "O";
        }     else {
            B8.setText("X");
            slider.setValue(0.0);
            board[8] = "X";
        }

        B8.setDisable(true);

        if (gameStateCheck().equals("X")) {
            info.setText("!!! X WON !!!");
        } else if (gameStateCheck().equals("O")) {
            info.setText("!!! O WON !!!");
        }
        else if (gameStateCheck().equals("draw")) {
            info.setText("!!! IT'S DRAW !!!");
        }
    }
}
