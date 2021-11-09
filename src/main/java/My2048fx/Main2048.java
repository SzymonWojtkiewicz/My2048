package My2048fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main2048 extends Application {
    public static void main(String[] args) {

        launch();


    }
    @Override
    public void start(Stage stage) throws Exception {
        AnchorPane appFXML = FXMLLoader.load(getClass().getResource("/appFXML.fxml"));
        Scene scene = new Scene(appFXML);
        stage.setScene(scene);
        stage.show();
    }
}
