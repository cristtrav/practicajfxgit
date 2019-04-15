package com.exabit.practicajfxgit;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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
    }

    @FXML
    private void onActionBtn3(ActionEvent event) {
    }

    @FXML
    private void onActionBtn4(ActionEvent event) {
          Alert a=new Alert(Alert.AlertType.INFORMATION);
       a.setContentText("Este boton fue hecho por forastero");
       a.show();
    }
    

    @FXML
    private void onActionBtn5(ActionEvent event) {
     
    }

    @FXML
    private void onActionBtn6(ActionEvent event) {
    }

    @FXML
    private void onActionBtn7(ActionEvent event) {
    }

    @FXML
    private void onActionBtnTest(ActionEvent event) {
    }
}
