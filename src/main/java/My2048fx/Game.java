package My2048fx;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;

public class Game {
    private final int[][] gameArray = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

    public Game() {
    }

    public boolean addNumber() {
        int quantityOfZeros = 0;
        //int[][] var2 = this.gameArray;
        //int newValue = this.gameArray.length;

        //int currentZeroIterator;
        //int var7;
        //int var8;
        for(int currentZeroIteratorRow = 0; currentZeroIteratorRow < this.gameArray.length; ++currentZeroIteratorRow) {
            //int[] y = gameArray[currentZero];
            int[] y = gameArray[currentZeroIteratorRow];
            //var7 = y.length;


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
                //int[] y = var16[var8];
                //int[] var10 = y;
                //int var11 = y.length;
                int[] y = gameArray[currentZeroIteratorRow];

                for(int currentZeroIteratorColumn = 0; currentZeroIteratorColumn < y.length; ++currentZeroIteratorColumn) {
                    int x = y[currentZeroIteratorColumn];
                    if (x == 0) {
                        ++currentZero;
                    }

                    if (currentZero == whichZeroToChange) {
                        y[x] = newValue;
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
        int edgeLine;
        int numericDirectionX;
        int numericDirectionY;
        int coordinateParallelToMovement;
        int corrdinatePerpendicularToMovment;
        int x;
        int y;

        /*  direction
                 up
            left    right
                down
         */
        switch (direction){
            case "up":
                edgeLine = 0;
                numericDirectionX = 0;
                numericDirectionY = -1;

                break;
            case "down":
                break;
            case "left":
                break;
            case "right":
                break;
        }



        return true;
    }
}
