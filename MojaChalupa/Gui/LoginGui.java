package sk.Vdovjak.OOP.MojaChalupa.Gui;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sk.Vdovjak.OOP.MojaChalupa.System.Login;

public class LoginGui {
    public StackPane root = new StackPane();
    private Stage stage;

    public LoginGui() {
        Button button = new Button("OPEN");
        VBox vBox = new VBox();
        TextField meno = new TextField();
        PasswordField heslo = new PasswordField();
        Button prihlasit = new Button("Prihlásiť");
        Login logni = new Login();

        vBox.setSpacing(8);
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.getChildren().addAll(
                new Label("Meno:"),
                meno,
                new Label("Heslo:"),
                heslo,
                prihlasit);
        root.getChildren().addAll(vBox);

        prihlasit.setOnAction(actionEvent-> {
            System.out.println(meno.getText()+"\n"+heslo.getText());


            stage = new Stage();
            StackPane stackPane = new StackPane();
            stage.setScene(new Scene(stackPane, 200,200));
            stage.show();
        });
    }


}
