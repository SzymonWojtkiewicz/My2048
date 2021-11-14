package My2048fx;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;

public class Game {
    private  int[][] gameArray = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

    private int score = 0;

    public Game() {
        this.addNumber();
        this.addNumber();
    }
    public boolean addNumber() {
        int quantityOfZeros = 0;

        for(int currentZeroIteratorRow = 0; currentZeroIteratorRow < this.gameArray.length; ++currentZeroIteratorRow) {
            int[] y = gameArray[currentZeroIteratorRow];

            for(int currentZeroIteratorColumn = 0; currentZeroIteratorColumn < y.length; ++currentZeroIteratorColumn) {
                int x = y[currentZeroIteratorColumn];
                if (x == 0) {
                    ++quantityOfZeros;
                }
            }
        }

        if (quantityOfZeros == 0) {
            return false;


        } else {
            int whichZeroToChange = (new Random()).nextInt(quantityOfZeros - 1 + 1) + 1;
            int newValue = (new Random()).nextInt(2) + 1;
            newValue *= 2;
            boolean breakAll = false;
            int currentZero = 0;


            for(int currentZeroIteratorRow = 0; currentZeroIteratorRow < this.gameArray.length; ++currentZeroIteratorRow) {

                int[] y = gameArray[currentZeroIteratorRow];

                for(int currentZeroIteratorColumn = 0; currentZeroIteratorColumn < y.length; ++currentZeroIteratorColumn) {
                    int x = y[currentZeroIteratorColumn];
                    if (x == 0) {
                        ++currentZero;

                    }

                    if (currentZero == whichZeroToChange) {
                        y[currentZeroIteratorColumn] = newValue;
                        breakAll = true;
                        break;
                    }
                }

                if (breakAll) {
                    break;
                }
            }

            return true;
        }
    }
    public boolean move(String direction){
        boolean somethingMoved = false;
        /* int edgeLine;
        int numericDirectionX;
        int numericDirectionY;
        int coordinateParallelToMovement;
        int coordinatePerpendicularToMovement;
        int x;
        int y;
        */
        /*  direction
                 up
            left    right
                down
         */
        switch (direction){
            case "up":
                for(int k = 1; k < gameArray.length; k++) {
                    for (int j = 1; j < gameArray.length; j++) {
                        for (int i = 0; i < gameArray.length; i++) {
                            if (gameArray[j][i] == 0)
                                continue;
                            if (gameArray[j][i] != 0 && gameArray[j - 1][i] == 0) {
                                gameArray[j - 1][i] = gameArray[j][i];
                                gameArray[j][i] = 0;
                                somethingMoved = true;
                            }
                        }
                    }
                }
                for (int j = 1; j < gameArray.length; j++) {
                    for (int i = 0; i < gameArray.length; i++) {
                        if (gameArray[j][i] == 0)
                            continue;
                        if (gameArray[j][i] != 0 && gameArray[j - 1][i] == gameArray[j][i]) {
                            gameArray[j - 1][i] = gameArray[j - 1][i] + gameArray[j][i];
                            gameArray[j][i] = 0;
                            score = score + gameArray[j - 1][i];
                            somethingMoved = true;
                        }
                    }
                }
                for(int k = 1; k < gameArray.length; k++) {
                    for (int j = 1; j < gameArray.length; j++) {
                        for (int i = 0; i < gameArray.length; i++) {
                            if (gameArray[j][i] == 0)
                                continue;
                            if (gameArray[j][i] != 0 && gameArray[j - 1][i] == 0) {
                                gameArray[j - 1][i] = gameArray[j][i];
                                gameArray[j][i] = 0;
                                somethingMoved = true;
                            }
                        }
                    }
                }
                break;
            case "down":
                for(int k = 1; k < gameArray.length; k++) {
                    for (int j = gameArray.length - 2; j > -1; j--) {
                        for (int i = 0; i < gameArray.length; i++) {
                            if (gameArray[j][i] == 0)
                                continue;
                            if (gameArray[j][i] != 0 && gameArray[j + 1][i] == 0) {
                                gameArray[j + 1][i] = gameArray[j][i];
                                gameArray[j][i] = 0;
                                somethingMoved = true;
                            }
                        }
                    }
                }
                for (int j = gameArray.length - 2; j > -1; j--) {
                    for (int i = 0; i < gameArray.length; i++) {
                        if (gameArray[j][i] == 0)
                            continue;
                        if (gameArray[j][i] != 0 && gameArray[j + 1][i] == gameArray[j][i]) {
                            gameArray[j + 1][i] = gameArray[j + 1][i] + gameArray[j][i];
                            gameArray[j][i] = 0;
                            score = score + gameArray[j + 1][i];
                            somethingMoved = true;
                        }
                    }
                }
                for(int k = 1; k < gameArray.length; k++) {
                    for (int j = gameArray.length - 2; j > -1; j--) {
                        for (int i = 0; i < gameArray.length; i++) {
                            if (gameArray[j][i] == 0)
                                continue;
                            if (gameArray[j][i] != 0 && gameArray[j + 1][i] == 0) {
                                gameArray[j + 1][i] = gameArray[j][i];
                                gameArray[j][i] = 0;
                                somethingMoved = true;
                            }
                        }
                    }
                }

                break;
            case "left":
                for(int k = 1; k < gameArray.length; k++) {
                    for (int i = 1; i < gameArray.length; i++) {
                        for (int j = 0; j < gameArray.length; j++) {
                            if (gameArray[j][i] == 0)
                                continue;
                            if (gameArray[j][i] != 0 && gameArray[j][i - 1] == 0) {
                                gameArray[j][i - 1] = gameArray[j][i];
                                gameArray[j][i] = 0;
                                somethingMoved = true;
                            }
                        }
                    }
                }
                for (int i = 1; i < gameArray.length; i++) {
                    for (int j = 0; j < gameArray.length; j++) {
                        if (gameArray[j][i] == 0)
                            continue;
                        if (gameArray[j][i] != 0 && gameArray[j][i - 1] == gameArray[j][i]) {
                            gameArray[j][i - 1] = gameArray[j][i - 1] + gameArray[j][i];
                            gameArray[j][i] = 0;
                            score = score + gameArray[j][i - 1];
                            somethingMoved = true;
                        }
                    }
                }
                for(int k = 1; k < gameArray.length; k++) {
                    for (int i = 1; i < gameArray.length; i++) {
                        for (int j = 0; j < gameArray.length; j++) {
                            if (gameArray[j][i] == 0)
                                continue;
                            if (gameArray[j][i] != 0 && gameArray[j][i - 1] == 0) {
                                gameArray[j][i - 1] = gameArray[j][i];
                                gameArray[j][i] = 0;
                                somethingMoved = true;
                            }
                        }
                    }
                }
                break;
            case "right":
                for(int k = 1; k < gameArray.length; k++) {
                    for (int i = gameArray.length - 2; i > -1; i--) {
                        for (int j = 0; j < gameArray.length; j++) {
                            if (gameArray[j][i] == 0)
                                continue;
                            if (gameArray[j][i] != 0 && gameArray[j][i + 1] == 0) {
                                gameArray[j][i + 1] = gameArray[j][i];
                                gameArray[j][i] = 0;
                                somethingMoved = true;
                            }
                        }
                    }
                }
                for (int i = gameArray.length - 2; i > -1; i--) {
                    for (int j = 0; j < gameArray.length; j++) {
                        if (gameArray[j][i] == 0)
                            continue;
                        if (gameArray[j][i] != 0 && gameArray[j][i + 1] == gameArray[j][i]) {
                            gameArray[j][i + 1] = gameArray[j][i + 1] + gameArray[j][i];
                            gameArray[j][i] = 0;
                            score = score + gameArray[j][i + 1];
                            somethingMoved = true;
                        }
                    }
                }
                for(int k = 1; k < gameArray.length; k++) {
                    for (int i = gameArray.length - 2; i > -1; i--) {
                        for (int j = 0; j < gameArray.length; j++) {
                            if (gameArray[j][i] == 0)
                                continue;
                            if (gameArray[j][i] != 0 && gameArray[j][i + 1] == 0) {
                                gameArray[j][i + 1] = gameArray[j][i];
                                gameArray[j][i] = 0;
                                somethingMoved = true;
                            }
                        }
                    }
                }
                break;
        }
        if(somethingMoved)
            return true;
        else
            return false;
    }
    public void restart(){
        for(int j = 0; j < gameArray.length; j++){
            for (int i = 0; i < gameArray[j].length; i++){
                gameArray[j][i] = 0;
            }
        }
        score = 0;
        addNumber();
        addNumber();

    }
    public int getScore(){
        return score;
    }
    public int[][] getGameArray(){
        return  gameArray;
    }



}

/*  switch (direction){
            case "up":
                for(int k = 1; k < gameArray.length; k++){
                    for(int j = 0; j < gameArray.length - k; j++){
                        for(int i = 0; i < gameArray.length; i++){
                            if(gameArray[j + 1][i] == 0)
                                continue;
                            if(gameArray[j + 1][i] == gameArray[j][i]){
                                somethingMoved = true;
                                gameArray[j][i] = gameArray[j][i] * 2;
                                gameArray[j + 1][i] = 0;
                                continue;
                            }
                            if(gameArray[j][i] == 0 && gameArray[j + 1][i] != 0){
                                somethingMoved = true;
                                gameArray[j][i] = gameArray[j + 1][i];
                                gameArray[j + 1][i] = 0;
                                continue;
                            }
                        }
                    }
                }
                break;
            case "down":
                //for(int k = gameArray.length - 1; k > 0; k--)
                for(int k =  0; k < gameArray.length - 1; k++){
                    for(int j = gameArray.length - 1; j > k ; j--){
                        for(int i = 0; i < gameArray.length; i++){
                            if(gameArray[j - 1][i] == 0)
                                continue;
                            if(gameArray[j - 1][i] == gameArray[j][i]){
                                somethingMoved = true;
                                gameArray[j][i] = gameArray[j][i] * 2;
                                gameArray[j - 1][i] = 0;
                                continue;
                            }
                            if(gameArray[j][i] == 0 && gameArray[j - 1][i] != 0){
                                somethingMoved = true;
                                gameArray[j][i] = gameArray[j - 1][i];
                                gameArray[j - 1][i] = 0;
                                continue;
                            }
                        }
                    }
                }
                break;
            case "left":
                //int i = 0; i < gameArray.length; i++
                for(int k = 1; k < gameArray.length; k++){
                    for(int i = 0; i < gameArray.length - k; i++){
                        for(int j = 0; j < gameArray.length; j++){
                            if(gameArray[j][i + 1] == 0)
                                continue;
                            if(gameArray[j][i + 1] == gameArray[j][i]){
                                somethingMoved = true;
                                gameArray[j][i] = gameArray[j][i] * 2;
                                gameArray[j][i + 1] = 0;
                                continue;
                            }
                            if(gameArray[j][i] == 0 && gameArray[j][i + 1] != 0){
                                somethingMoved = true;
                                gameArray[j][i] = gameArray[j][i + 1];
                                gameArray[j][i + 1] = 0;
                                continue;
                            }
                        }
                    }
                }
                break;
            case "right":
                for(int k = 0; k < gameArray.length - 1; k++){
                    for(int i = gameArray.length - 1; i > k; i--){
                        for(int j = 0; j < gameArray.length; j++){
                            if(gameArray[j][i - 1] == 0)
                                continue;
                            if(gameArray[j][i - 1] == gameArray[j][i]){
                                somethingMoved = true;
                                gameArray[j][i] = gameArray[j][i] * 2;
                                gameArray[j][i - 1] = 0;
                                continue;
                            }
                            if(gameArray[j][i] == 0 && gameArray[j][i - 1] != 0){
                                somethingMoved = true;
                                gameArray[j][i] = gameArray[j][i - 1];
                                gameArray[j][i - 1] = 0;
                                continue;
                            }
                        }
                    }
                }
                break;
        }*/
