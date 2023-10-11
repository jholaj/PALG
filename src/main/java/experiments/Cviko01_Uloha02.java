package experiments;
// Doplň kód tak, aby se přečetl řetězec z konzole a vypsalo se "nalezeno",
// pokud bylo zadáno některé z pevně daných jmen (případně "nenalezeno")

import java.util.Scanner;

public class Cviko01_Uloha02
{
    public static void main(String[] args)
    {
        String[] jmena = new String[]{"Honza", "Kuba", "Kryšpín", "Alois", "Karel", "Otakar", "Štěpán"};
        Scanner sc = new Scanner(System.in);

        String hledanaHodnota = sc.nextLine();

        if(obsahuje(jmena, hledanaHodnota)) {
            System.out.printf("nalezeno");
        } else {
            System.out.printf("nenalezeno");
        }

    }

    public static boolean obsahuje(String[] hodnoty, String hledanaHodnota)
    {
        for(int i = 0; i < hodnoty.length; i++){
            if(hodnoty[i].equals(hledanaHodnota)){
                return true;
            }
        }
        return false;
    }

}
