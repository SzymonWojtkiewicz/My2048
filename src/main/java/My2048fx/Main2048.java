package My2048fx;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main2048 extends Application {
    public static void main(String[] args) {
        Game newGame = new Game();

        launch();
        //Label pageNumber = new Label();
        //pageNumber.setText("" +newGame.gameArray[0][0]);

    }
    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane appFXML = FXMLLoader.load(getClass().getResource("/appFXML.fxml"));
        Scene scene = new Scene(appFXML);
        stage.setScene(scene);
        stage.show();
    }
}
