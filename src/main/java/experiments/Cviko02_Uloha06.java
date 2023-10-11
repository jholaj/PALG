package experiments;
import java.util.Random;

public class Cviko02_Uloha06
{
    public static void main(String[] args)
    {
    }

    // Doplň metodu, která vytvoří pole N náhodných celých čísel v rozsahu 0 až M
    //public static ... randomNumbers( ... )
    //{
    //}

    public static int[] randomNumbers(int n, int m){
        Random random = new Random();
        int[] result = new int[n];
        for(int i = 0; i < result.length; i++){
            result[i] = random.nextInt(m+1);
        }
        return result;
    }
}
