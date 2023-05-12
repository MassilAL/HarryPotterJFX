package com.example.harrypotterjfx;

import com.example.harrypotterjfx.vue.StartController;
import com.example.harrypotterjfx.vue.StartVue;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void showStartScene(){
        StartVue startVue= new StartVue();
        StartController startController = new StartController();
    }
    public static void main(String[] args) {
        launch();
    }
}