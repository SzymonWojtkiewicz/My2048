package My2048fx;




import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;



public class mainWindowController {

    @FXML
    private Label field00Label;

    @FXML
    private Label field01Label;

    @FXML
    private Label field02Label;

    @FXML
    private Label field03Label;

    @FXML
    private Label field10Label;

    @FXML
    private Label field11Label;

    @FXML
    private Label field12Label;

    @FXML
    private Label field13Label;

    @FXML
    private Label field20Label;

    @FXML
    private Label field21Label;

    @FXML
    private Label field22Label;

    @FXML
    private Label field23Label;

    @FXML
    private Label field30Label;

    @FXML
    private Label field31Label;

    @FXML
    private Label field32Label;

    @FXML
    private Label field33Label;

    @FXML
    private Button newGameButton;

    @FXML
    private Label scoreLabel;

    @FXML
    private GridPane mainGrid;

    @FXML
    private AnchorPane mainAnchorPane;



    public void initialize(){
        Game newGame = new Game();
        display(newGame.getGameArray());

        newGameButton.setOnAction(event -> {
            newGame.restart();
            display(newGame.getGameArray());
            scoreLabel.setText("MY 2048");
        });

        mainAnchorPane.addEventFilter(KeyEvent.KEY_PRESSED, KeyEvent ->{

            switch (KeyEvent.getCode()){
                case UP:
                    if(newGame.move("up"))
                        newGame.addNumber();
                    display(newGame.getGameArray());
                    scoreLabel.setText((Integer.toString((newGame.getScore()))));
                    break;
                case DOWN:
                    if(newGame.move("down"))
                        newGame.addNumber();
                    display(newGame.getGameArray());
                    scoreLabel.setText((Integer.toString((newGame.getScore()))));
                    break;
                case LEFT:
                    if(newGame.move("left"))
                        newGame.addNumber();
                    display(newGame.getGameArray());
                    scoreLabel.setText((Integer.toString((newGame.getScore()))));
                    break;
                case RIGHT:
                    if(newGame.move("right"))
                        newGame.addNumber();
                    display(newGame.getGameArray());
                    scoreLabel.setText((Integer.toString((newGame.getScore()))));
                    break;
            }
        });

    }


    private void display(int[][] gameArray){
        field00Label.setText(Integer.toString(gameArray[0][0]));
        field00Label.setStyle("-fx-background-color: " + setColor(gameArray[0][0]));
        field10Label.setText(Integer.toString(gameArray[0][1]));
        field10Label.setStyle("-fx-background-color: " + setColor(gameArray[0][1]));
        field20Label.setText(Integer.toString(gameArray[0][2]));
        field20Label.setStyle("-fx-background-color: " + setColor(gameArray[0][2]));
        field30Label.setText(Integer.toString(gameArray[0][3]));
        field30Label.setStyle("-fx-background-color: " + setColor(gameArray[0][3]));

        field01Label.setText(Integer.toString(gameArray[1][0]));
        field01Label.setStyle("-fx-background-color: " + setColor(gameArray[1][0]));
        field11Label.setText(Integer.toString(gameArray[1][1]));
        field11Label.setStyle("-fx-background-color: " + setColor(gameArray[1][1]));
        field21Label.setText(Integer.toString(gameArray[1][2]));
        field21Label.setStyle("-fx-background-color: " + setColor(gameArray[1][2]));
        field31Label.setText(Integer.toString(gameArray[1][3]));
        field31Label.setStyle("-fx-background-color: " + setColor(gameArray[1][3]));

        field02Label.setText(Integer.toString(gameArray[2][0]));
        field02Label.setStyle("-fx-background-color: " + setColor(gameArray[2][0]));
        field12Label.setText(Integer.toString(gameArray[2][1]));
        field12Label.setStyle("-fx-background-color: " + setColor(gameArray[2][1]));
        field22Label.setText(Integer.toString(gameArray[2][2]));
        field22Label.setStyle("-fx-background-color: " + setColor(gameArray[2][2]));
        field32Label.setText(Integer.toString(gameArray[2][3]));
        field32Label.setStyle("-fx-background-color: " + setColor(gameArray[2][3]));

        field03Label.setText(Integer.toString(gameArray[3][0]));
        field03Label.setStyle("-fx-background-color: " + setColor(gameArray[3][0]));
        field13Label.setText(Integer.toString(gameArray[3][1]));
        field13Label.setStyle("-fx-background-color: " + setColor(gameArray[3][1]));
        field23Label.setText(Integer.toString(gameArray[3][2]));
        field23Label.setStyle("-fx-background-color: " + setColor(gameArray[3][2]));
        field33Label.setText(Integer.toString(gameArray[3][3]));
        field33Label.setStyle("-fx-background-color: " + setColor(gameArray[3][3]));


    }



    private String setColor(int value){
        MapOfColor newMap = new MapOfColor();
        return newMap.colorMap.get(value);
    }

}
