package experiments;

import java.util.Random;

public class Cviko09
{
    public static void main(String[] args)
    {
        Random random = new Random();
        Cviko09_ComparableItem[] sequnce = new Cviko09_ComparableItem[300];
        for(int i=0; i< sequnce.length; i++)
        {
            sequnce[i] = new Cviko09_ComparableItem(random.nextDouble()*100);
        }
        Cviko09_Sorter s = new Cviko09_SelectionSorter();
        s.sortWithReport(sequnce);
    }
}
