package com.example.oopatmproject;

public enum View{
    WELCOMEPAGE("welcomePage.fxml"),
    CARDTERMINALPAGE("cardTerminalPage.fxml"),
    PINPAGE("enterPinNoPage.fxml"),
    MAINMENUPAGE("mainMenuPage.fxml"),
    DEPOSITACCPAGE("chooseAccountDepositPage.fxml"),
    DEPOSITAMTPAGE("amountDepositPage.fxml"),
    DEPOSITCONFIRMPAGE("confirmDepositPage.fxml"),
    DEPOSITFINALPAGE("depositFinalPage.fxml");

    private String fileName;

    View(String fileName){
        this.fileName = fileName;
    }

    public String getFileName(){
        return fileName;
    }
}

