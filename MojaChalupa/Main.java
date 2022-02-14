package sk.Vdovjak.OOP.MojaChalupa;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sk.Vdovjak.OOP.MojaChalupa.Gui.LoginGui;
import sk.Vdovjak.OOP.MojaChalupa.System.Login;

public class Main extends Application  {
    LoginGui loginokno = new LoginGui();

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(loginokno.root,400,600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Moja Chalupa");
        primaryStage.setAlwaysOnTop(true);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
