package experiments;

public class Cviko09_HeapSorter extends Cviko09_Sorter
{
    public void sort(Comparable[] sequence)
    {
        Cviko09_ComparableHeap heap
                = new Cviko09_ComparableHeap(sequence.length);
        for (Comparable item : sequence)        {
            heap.insert(item);
        }

        for(int i=0; i<sequence.length; i++) {
            sequence[i] = heap.extractMin();
        }
    }
}
