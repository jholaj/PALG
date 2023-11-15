package experiments;

import java.util.Random;

public class Cviko08
{
    public static void main(String[] args)
    {
        Cviko08_Heap heap = new Cviko08_Heap(10_000_000);
        Random random = new Random();
        int count = 8_000_000;
        long startTime = System.nanoTime();
        for(int i=0;i<count;i++)
        {
            double key = random.nextDouble()*100;
            Cviko05_Item payload = new Cviko05_Item(new double[]{0,0},"");
            heap.insert(key, payload);
        }
        long endTime = System.nanoTime();
        System.out.println(
                "Vkládání "+count+" položek trvalo "+ ( endTime - startTime )/1_000_000_000f + " sekund");
    }
}
