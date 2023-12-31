package experiments;

public class Cviko03_Uloha05
{
    public static void main(String[] args)
    {
        double[][] matrix0 = {
                {1.0, 1.5, 2.5, 2.7, 1.7},
                {1.9, 2.1, 4.0, 4.0, 4.6},
                {8.8, 2.1, 3.9, 8.1, 11.6},
                {10.9, 2.1, 2.1, 4.0, 4.6},
                {0.1, 3.1, 7.2, 7.1, 9.6}};
        writeMatrixInfo0(matrix0);
        writeMatrixInfo1(matrix0);
    }

    // Doplň metodu, která vypíše součet prvků na hlavní diagonále
    public static void writeMatrixInfo0(double[][] matrix)
    {

        double sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        System.out.println(sum);

    }

    // Doplň metodu, která vypíše součet prvků na vedlejší diagonále
    public static void writeMatrixInfo1(double[][] matrix)
    {
        double sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][matrix.length - i - 1];
        }

        System.out.println(sum);
    }
}
