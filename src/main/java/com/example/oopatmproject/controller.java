package com.example.oopatmproject;

public class controller {
    public void toCardTerminalPage(){
        ViewSwitcher.switchTo(View.CARDTERMINALPAGE);
    }
    public void toEnterPinNoPage(){
        ViewSwitcher.switchTo(View.PINPAGE);
    }
    public void toMainMenuPage(){
        ViewSwitcher.switchTo(View.MAINMENUPAGE);
    }
    public void toDepositAccPage() {
        ViewSwitcher.switchTo(View.DEPOSITACCPAGE);
    }
    public void toDepositAmtPage(){
        ViewSwitcher.switchTo(View.DEPOSITAMTPAGE);
    }
    public void toDepositConfirmPage(){
        ViewSwitcher.switchTo(View.DEPOSITCONFIRMPAGE);
    }
    public void toDepositFinalPage(){
        ViewSwitcher.switchTo(View.DEPOSITFINALPAGE);
    }
}