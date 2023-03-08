package com.example.oopatmproject;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.Parent;

import java.io.IOException;

public class ViewSwitcher {
    private static Scene scene;
    public static void setScene(Scene scene){
        ViewSwitcher.scene = scene;
    }
    public static void switchTo(View view){
        try{
            Parent root = FXMLLoader.load(ViewSwitcher.class.getResource(view.getFileName()));
            scene.setRoot(root);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}