package experiments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cviko04_Uloha02
{
    public static void main(String[] args) throws FileNotFoundException {
        double[][] matrix = matrixFromFile();
        for (int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }

    // Doplň metodu tak, aby četla matici ze souboru
    public static double[][] matrixFromFile() throws FileNotFoundException {
        String path = System.getProperty("user.dir")+"/sample02.txt";
        Scanner scanner = new Scanner(new File(path));

        ArrayList<double[]> result = new ArrayList<>();


        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] parts = line.split("\\s+");
            double[] row = new double[parts.length];

            for(int i=0; i< parts.length; i++){
                row[i] = Double.parseDouble(parts[i]);
            }

            result.add(row);

        }
        return result.toArray(new double[0][]);
    }
}
