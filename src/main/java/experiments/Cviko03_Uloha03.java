package experiments;

public class Cviko03_Uloha03
{
    public static void main(String[] args)
    {
        double[][] matrix2 = new double[][]{
                {1.3, 1.4, 2.8, 2.9, 1.3},
                {1.7, 2.6, 2.8, 4.1, 4.0},
                {1.5, 2.7, 3.8, 4.4, 1.8},
                {1.7, 4.2, 1.2, 2.2, 5.2}
        };

        System.out.println(sum(matrix2));
    }

    // Doplň metodu, která spočítá součet všech prvků 2D pole
    public static double sum(double[][] matrix)
    {
        double sum = 0;
        for (int i=0;i<matrix.length;i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
                sum = sum + matrix[i][j];
        }
        //vraci infinity ????
        double r  = 1000.0 / 0;

        return sum;
    }
}
