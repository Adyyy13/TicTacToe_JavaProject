package tictactoe.tictactoe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.stage.Stage;


import java.io.IOException;

public class GameController extends Engine {

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

    public Slider slider = null;


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
    protected void onB0ButtonClick(ActionEvent actionEvent) {
        if (slider.getValue() == 0.0) {
            B0.setText("O");
            slider.setValue(1.0);
        }     else {
            B0.setText("X");
            slider.setValue(0.0);
        }

        B0.setDisable(true);

    }

    @FXML
    protected void onB1ButtonClick(ActionEvent actionEvent) {
        if (slider.getValue() == 0.0) {
            B1.setText("O");
            slider.setValue(1.0);
        }     else {
            B1.setText("X");
            slider.setValue(0.0);
        }

        B1.setDisable(true);
    }

    @FXML
    protected void onB2ButtonClick(ActionEvent actionEvent) {
        if (slider.getValue() == 0.0) {
            B2.setText("O");
            slider.setValue(1.0);
        }     else {
            B2.setText("X");
            slider.setValue(0.0);
        }

        B2.setDisable(true);
    }

    @FXML
    protected void onB3ButtonClick(ActionEvent actionEvent) {
        if (slider.getValue() == 0.0) {
            B3.setText("O");
            slider.setValue(1.0);
        }     else {
            B3.setText("X");
            slider.setValue(0.0);
        }

        B3.setDisable(true);
    }
    @FXML
    protected void onB4ButtonClick(ActionEvent actionEvent) {
        if (slider.getValue() == 0.0) {
            B4.setText("O");
            slider.setValue(1.0);
        }     else {
            B4.setText("X");
            slider.setValue(0.0);
        }

        B4.setDisable(true);
    }
    @FXML
    protected void onB5ButtonClick(ActionEvent actionEvent) {
        if (slider.getValue() == 0.0) {
            B5.setText("O");
            slider.setValue(1.0);
        }     else {
            B5.setText("X");
            slider.setValue(0.0);
        }

        B5.setDisable(true);
    }
    @FXML
    protected void onB6ButtonClick(ActionEvent actionEvent) {
        if (slider.getValue() == 0.0) {
            B6.setText("O");
            slider.setValue(1.0);
        }     else {
            B6.setText("X");
            slider.setValue(0.0);
        }

        B6.setDisable(true);
    }
    @FXML
    protected void onB7ButtonClick(ActionEvent actionEvent) {
        if (slider.getValue() == 0.0) {
            B7.setText("O");
            slider.setValue(1.0);
        }     else {
            B7.setText("X");
            slider.setValue(0.0);
        }

        B7.setDisable(true);
    }
    @FXML
    protected void onB8ButtonClick(ActionEvent actionEvent) {
        if (slider.getValue() == 0.0) {
            B8.setText("O");
            slider.setValue(1.0);
        }     else {
            B8.setText("X");
            slider.setValue(0.0);
        }

        B8.setDisable(true);
    }
}
