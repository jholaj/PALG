package experiments;
import java.util.*;

public class Cviko07
{
    public static void main(String[] args)
    {
        Cviko07_Tree collection
                = new Cviko07_Tree();
        Random random = new Random();
        int count = 8_000_000;
        long startTime = System.nanoTime();
        long[] allKeys = new long[count];
        for(int i=0;i<count;i++)
        {
            long key = random.nextLong();
            allKeys[i] = key;
            Cviko05_Item value
                    = new Cviko05_Item(new double[]{0,0},"");
            collection.put(key, value);
        }
        long endTime = System.nanoTime();

        float time = (endTime-startTime)/1_000_000_000f;

        System.out.println(
                "Vkládání "+count+" položek trvalo "+ time + " sekund");

        long startTime1 = System.nanoTime();


        for(int j=0;j<1_000_000;j++)
        {
            collection.get(allKeys[8*j]);
        }

        long endTime1 = System.nanoTime();


        float time1 = (endTime1-startTime1)/1_000_000_000f;


        System.out.println(
                "Vyhledávání 1_000_000 položek trvalo "+ time1 + " sekund");
    }
}
