package experiments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cviko04_Uloha01
{
    public static void main(String[] args) throws FileNotFoundException {
        double[] pole = arrayFromFile();
        for (int i = 0; i < pole.length; i++){
            System.out.println(pole[i]);
        }
    }

    // Doplň metodu tak, aby četla pole ze souboru (jeden řádek)
    public static double[] arrayFromFile() throws FileNotFoundException {
        String path = System.getProperty("user.dir")+"/sample01.txt";
        Scanner scanner = new Scanner(new File(path));

        String line = scanner.nextLine();

        String[] parts = line.split("\\s+");
        double[] result = new double[parts.length];

        for (int i = 0; i < parts.length; i++) {
            result[i] = Double.parseDouble(parts[i]);
        }

        return result;
    }
}
