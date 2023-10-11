package experiments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cviko04_Uloha01
{
    public static void main(String[] args) {
    }

    // Doplň metodu tak, aby četla pole ze souboru (jeden řádek)
    public static double[] arrayFromFile() throws FileNotFoundException {
        String path = System.getProperty("user.dir")+"/sample01.txt";
        Scanner scanner = new Scanner(new File(path));

        return null;
    }
}
