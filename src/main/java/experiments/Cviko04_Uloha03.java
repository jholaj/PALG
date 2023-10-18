package experiments;

import java.io.FileNotFoundException;

public class Cviko04_Uloha03
{
    public static void main(String[] args) throws FileNotFoundException {
        double[][] matrix = Cviko04_Uloha02.matrixFromFile();
        double[] vector = Cviko04_Uloha01.arrayFromFile();
        double[] vector2 = product(matrix, vector);
        System.out.println("Bilkoviny: " + vector2[0] + " Cukry: " + vector2[1] + " Vlákniny: " + vector2[2]);
    }

    // Doplň metodu tak, aby vynásobila vektor maticí zleva
    public static double[] product(double[][] matrix, double[] vector)  {
        double[] vystup = new double[matrix.length];
        for (int row = 0; row < matrix.length; row++){
            double sum = 0;
            for (int column = 0; column < matrix.length; column++){
                sum += vector[column] * matrix[row][column];
            }
            vystup[row] = sum;
        }
        return vystup;
    }
}
