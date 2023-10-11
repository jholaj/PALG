package experiments;
// Doplň kód tak, aby se přečetl řetězec z konzole a vypsalo se,
// kolikáté jméno bylo zadáno (nebo že nebylo nalezeno)

import java.util.Scanner;

public class Cviko01_Uloha03
{
    public static void main(String[] args)
    {
        String[] jmena = new String[]{"Honza", "Kuba", "Kryšpín", "Alois", "Karel", "Otakar", "Štěpán"};
        System.out.println("Zadej jméno:");
        Scanner scanner = new Scanner(System.in);
        String zadavaneJmeno = scanner.nextLine();

        int index = -1;
        for (int i = 0; i < jmena.length; i++) {
            if (jmena[i].equals(zadavaneJmeno)) {
                index = i;
                break;
            }
        }

        // Vypíšeme výsledek
        if (index != -1) {
            System.out.println("Zadané jméno je " + (index + 1) + ". v pořadí.");
        } else {
            System.out.println("Zadané jméno nebylo nalezeno.");
        }
    }
}
