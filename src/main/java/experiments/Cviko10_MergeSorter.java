package experiments;

public class Cviko10_MergeSorter extends Cviko09_Sorter
{
    public void sort(Comparable[] sequence)
    {
        sortPart(sequence, 0, sequence.length);
    }

    private void sortPart(Comparable[] sequence, int start, int count)
    {
        if(count <= 1)
        {
            return;
        }
        int count1 = count/2;
        sortPart(sequence, start, count1 );
        sortPart(sequence, start+count1, count-count1 );
        Comparable[] source1 =
                Cviko10_Utils.makeCopy(sequence, start, count1);
        Comparable[] source2 =
                Cviko10_Utils.makeCopy(sequence, start+count1, count-count1 );
        Cviko10_Utils.merge(
                sequence,
                start,
                source1,
                source2);
    }


}
