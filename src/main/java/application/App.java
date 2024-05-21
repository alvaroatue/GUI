package application;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import utilities.Paths;

public class App extends Application {

    public static  void main(String[] args) {

        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = FXMLLoader.load(getClass().getResource("/Fxml/login.fxml"));
        Scene scene =new Scene(loader.load());
        stage.setScene(scene);
        stage.show();

    }
}
