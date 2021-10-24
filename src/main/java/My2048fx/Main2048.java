package My2048fx;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main2048 extends Application {
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.addNumber();
        newGame.addNumber();
        newGame.addNumber();
        newGame.addNumber();
        newGame.addNumber();
        newGame.addNumber();
        newGame.addNumber();
        newGame.addNumber();
        newGame.addNumber();
        newGame.move("up");
        newGame.move("down");
        newGame.move("left");
        newGame.move("right");

        launch();
        Label pagenumber = new Label();
        pagenumber.setText("" +newGame.gameArray[0][0]);

    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("2048");


        stage.show();

    }
}
