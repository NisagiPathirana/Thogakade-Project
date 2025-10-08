package edu.icet.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashBoardController {

    Stage customerManagement = new Stage();
    Stage itemManagement = new Stage();
    Stage orderManagement = new Stage();
    Stage orderDetailManagement = new Stage();

    @FXML
    private JFXButton btnCustomerManagement;

    @FXML
    private JFXButton btnItemManagement;

    @FXML
    private JFXButton btnOrderDetailManagement;

    @FXML
    private JFXButton btnOrderManagement;

    @FXML
    void btnCustomerManagementOnAction(ActionEvent event) {
        try {
            customerManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Customer.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void btnItemManagementOnAction(ActionEvent event) {

    }


    @FXML
    void btnOrderManagementOnAction(ActionEvent event) {

    }

    @FXML
    void btnOrderDetailManagementOnAction(ActionEvent event) {

    }

}
