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
        customerManagement.show();
    }

    @FXML
    void btnItemManagementOnAction(ActionEvent event) {

        try {
            itemManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Item.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        itemManagement.show();
    }

    @FXML
    void btnOrderManagementOnAction(ActionEvent event) {

        try {
            orderManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Order.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        orderManagement.show();
    }

    @FXML
    void btnOrderDetailManagementOnAction(ActionEvent event) {
        try {
            orderDetailManagement.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/OrderDetails.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        orderDetailManagement.show();

    }

}
