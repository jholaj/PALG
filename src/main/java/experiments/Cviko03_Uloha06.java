package experiments;

public class Cviko03_Uloha06
{
    public static void main(String[] args)
    {
        double[][] matrix0 = {
                {1.0, 1.5, 2.5, 2.7, 1.7},
                {1.9, 2.1, 4.0, 4.0, 4.6},
                {8.8, 2.1, 3.9, 8.1, 11.6},
                {10.9, 2.1, 2.1, 4.0, 4.6},
                {0.1, 3.1, 7.2, 7.1, 9.6}};
        mirror(matrix0);

        Cviko03_Uloha04.print(matrix0);
    }

    // Doplň metodu, která matici převrátí podle hlavní diagonály (osy)
    public static void mirror(double[][] matrix)
    {
        double temp;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j > i) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

    }
}
