package experiments;

import java.util.*;

public class Cviko02_Uloha07
{
    public static void main(String[] args)
    {
    }

    // Doplň metodu, která z daného pole vybere pouze záporná čísla a vrátí pole vybraných čísel
    public static int[] negatives(int[] all)
    {
        throw new RuntimeException();
    }

    public static int[] ListToArray(ArrayList<Integer> list)
    {
        int[] res = new int[list.size()];
        for(int i=0;i<res.length;i++)
        {
            res[i] = list.get(i);
        }
        return res;
    }
}
