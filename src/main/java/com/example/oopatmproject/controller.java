package com.example.oopatmproject;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controller {
    @FXML
    private TextField uuidTxt;
    private static String uuid;
    @FXML
    private TextField pinTxt;
    private String pin;






    //Page Switchers
    public void toCardTerminalPage() { ViewSwitcher.switchTo(View.CARDTERMINALPAGE); }
    public void toEnterPinNoPage(){

        ViewSwitcher.switchTo(View.PINPAGE);

        //trying to get the uuid input
        uuid = uuidTxt.getText();
        //checking if it took in the input
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Testing");
        a.setContentText(uuid);
        a.showAndWait();
    }
    public void toMainMenuPage() {
        ViewSwitcher.switchTo(View.MAINMENUPAGE);

        //trying to get the pin input
        pin = pinTxt.getText();
        //checking if it took in the input
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Testing");
        a.setContentText(uuid+" "+pin);
        a.showAndWait();
    }
    public void toDepositAccPage() { ViewSwitcher.switchTo(View.DEPOSITACCPAGE); }
    public void toDepositAmtPage() { ViewSwitcher.switchTo(View.DEPOSITAMTPAGE); }
    public void toDepositConfirmPage() { ViewSwitcher.switchTo(View.DEPOSITCONFIRMPAGE); }
    public void toDepositFinalPage() { ViewSwitcher.switchTo(View.DEPOSITFINALPAGE); }
}