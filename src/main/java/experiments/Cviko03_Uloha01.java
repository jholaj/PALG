package experiments;

import java.lang.instrument.Instrumentation;

public class Cviko03_Uloha01
{
    public static void main(String[] args)
    {
        int[][] matrix0 = {{1,1,2,2,1},{1,2,2,4,4},{1,2,3,4,1},{1,4,1,2,5}};

        // Doplň jiný způsob deklarace 2D pole,
        // tak aby mělo stejné rozměry jako matrix0

        int[][] matrix1 = new int[4][5];

        int[][] matrix2 = new int[][]{
            {1, 1, 2, 2, 1},
            {1, 2, 2, 4, 4},
            {1, 2, 3, 4, 1},
            {1, 4, 1, 2, 5}
        };

        int[][] matrix3 = new int[][]{
                new int[]{1, 1, 2, 2, 1},
                new int[]{1, 2, 2, 4, 4},
                new int[]{1, 2, 3, 4, 1},
                new int[]{1, 4, 1, 2, 5}
        };




    }
}
