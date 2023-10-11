package experiments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cviko04_Uloha02
{
    public static void main(String[] args) {
    }

    // Doplň metodu tak, aby četla matici ze souboru
    public static double[][] matrixFromFile() throws FileNotFoundException {
        String path = System.getProperty("user.dir")+"/sample02.txt";
        Scanner scanner = new Scanner(new File(path));

        ArrayList<double[]> result = new ArrayList<>();
        while (scanner.hasNextLine()) {

        }

        return null;
    }
}
