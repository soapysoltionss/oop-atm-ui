package com.example.oopatmproject;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    Scene welcomePage, cardTerminalPage, enterPinNoPage, mainMenuPage, depositMoney1Page, depositMoney2Page, depositMoney3Page;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("welcomePage.fxml"));
        Scene welcomePage = new Scene(fxmlLoader.load(),600,400);
        welcomePage.addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                System.out.println("mouse click detected! " + mouseEvent.getSource());
            }
        });
        stage.setResizable(false);
        stage.setScene(welcomePage);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}