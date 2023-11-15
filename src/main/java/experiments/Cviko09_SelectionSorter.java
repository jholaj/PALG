package experiments;

import java.io.IOException;
import java.util.List;

public class Cviko09_SelectionSorter extends Cviko09_Sorter
{
    public void sort(Comparable[] sequence)
    {
        for (int doneCount =0; doneCount < sequence.length; doneCount++)
        {
            int minIndex = minIndex(sequence, doneCount);
            Comparable temp = sequence[doneCount];
            sequence[doneCount] = sequence[minIndex];
            sequence[minIndex] = temp;
        }
    }

    private int minIndex(Comparable[] sequence, int doneCount)
    {
        int minIndex = 0;
        Comparable minValue = null;
        for(int i=doneCount; i<sequence.length;i++)
        {
            if(minValue== null || minValue.compareTo(sequence[i]) > 0)
            {
                minValue = sequence[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
