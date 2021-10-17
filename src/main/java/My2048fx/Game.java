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
        int numbersOfZeros = 0;
        int[][] var2 = this.gameArray;
        int newValue = var2.length;

        int currentZero;
        int var7;
        int var8;
        for(currentZero = 0; currentZero < newValue; ++currentZero) {
            int[] y = var2[currentZero];
            int[] var6 = y;
            var7 = y.length;

            for(var8 = 0; var8 < var7; ++var8) {
                int x = var6[var8];
                if (x == 0) {
                    ++numbersOfZeros;
                }
            }
        }

        if (numbersOfZeros == 0) {
            return false;
        } else {
            int whichZeroToChange = (new Random()).nextInt(numbersOfZeros - 1 + 1) + 1;
            newValue = (new Random()).nextInt(2) + 1;
            newValue *= 2;
            currentZero = 0;
            boolean breakAll = false;
            int[][] var16 = this.gameArray;
            var7 = var16.length;

            for(var8 = 0; var8 < var7; ++var8) {
                int[] y = var16[var8];
                int[] var10 = y;
                int var11 = y.length;

                for(int var12 = 0; var12 < var11; ++var12) {
                    int x = var10[var12];
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
}
