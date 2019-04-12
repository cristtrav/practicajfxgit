package com.exabit.practicajfxgit;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btnTest;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionBtn1(ActionEvent event) {
    }

    @FXML
    private void onActionBtn2(ActionEvent event) {
        Alert al = new Alert(AlertType.ERROR);
        al.setContentText("Boton ocupado "
                + "TANIA GARAY");
        al.show();
    }

    @FXML
    private void onActionBtn3(ActionEvent event) {
    }

    @FXML
    private void onActionBtn4(ActionEvent event) {
    }

    @FXML
    private void onActionBtn5(ActionEvent event) {
        Alert al=new Alert(Alert.AlertType.CONFIRMATION);
        al.setContentText("Confirmado por Alejandra González");
        al.show();
    }

    @FXML
    private void onActionBtn6(ActionEvent event) {
        Alert a=new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Hola Gente.???");
        a.show();
    }

    @FXML
    private void onActionBtn7(ActionEvent event) {
        Alert a= new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Hecho por Elton Hernan Rodriguez Recalde");
        a.show();
    }

    @FXML
    private void onActionBtnTest(ActionEvent event) {
    }
}
