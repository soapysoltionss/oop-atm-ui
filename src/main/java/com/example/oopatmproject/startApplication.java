package com.example.oopatmproject;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class startApplication extends Application {

    Scene welcomePage, cardTerminalPage, enterPinNoPage, mainMenuPage, depositMoney1Page, depositMoney2Page, depositMoney3Page;
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(startApplication.class.getResource("mainMenuPage.fxml"));
        //Scene welcomePage = new Scene(fxmlLoader.load(),600,400);
        Scene scene = new Scene(new Pane());
        ViewSwitcher.setScene(scene);
        ViewSwitcher.switchTo(View.WELCOMEPAGE);
        /*
        scene.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                ViewSwitcher.switchTo(View.CARDTERMINALPAGE);
                //System.out.println("mouse click detected! " + mouseEvent.getSource());
            }
        });
         */
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}