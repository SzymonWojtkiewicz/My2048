package My2048fx;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main2048 extends Application {
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.addNumber();
        newGame.addNumber();
        newGame.addNumber();
        newGame.addNumber();
        newGame.move("up");
        newGame.addNumber();
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("2048");
        stage.show();

    }
}
