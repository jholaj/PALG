package experiments;

import java.util.NoSuchElementException;

public class Cviko09_ComparableHeap
{
    private Comparable[] data;
    private int count;

    public Cviko09_ComparableHeap(int capacity)
    {
        data = new Comparable[capacity];
        count = 0;
    }

    public void insert(Comparable key)
    {
        if(count >= data.length)
        {
            throw new IndexOutOfBoundsException();
        }
        data[ count ] = key;
        count++;
        repairUp(count-1);
    }

    public Comparable getMin()
    {
        if(count == 0)
        {
            throw new NoSuchElementException();
        }
        return data[0];
    }

    public Comparable extractMin()
    {
        if(count==0) throw new NoSuchElementException();
        Comparable temp = data[0];
        data[0] = data[count-1];
        count--;
        repairDown(0);
        return temp;
    }

    private void swap(int i1, int i2)
    {
        Comparable temp =data[i1];
        data[i1] = data[i2];
        data[i2] = temp;
    }

    private void repairUp(int index)
    {
        if(index == 0) return;
        int parentIndex = parentIndex(index);
        if(data[parentIndex].compareTo(data[index])>0)
        {
            swap(index,parentIndex);
            repairUp(parentIndex);
        }
    }

    private void repairDown(int index)
    {
        int leftChildIndex = leftChildIndex(index);
        int rightChildIndex = rightChildIndex(index);
        if(rightChildIndex < count
                && data[leftChildIndex].compareTo(data[rightChildIndex])>=0
                && data[rightChildIndex].compareTo(data[index])<0)
        {
            swap(rightChildIndex,index);
            repairDown(rightChildIndex);

        }
        else if(leftChildIndex < count
                && data[rightChildIndex].compareTo(data[leftChildIndex])>=0
                && data[leftChildIndex].compareTo(data[index])<0)
        {
            swap(leftChildIndex,index);
            repairDown(leftChildIndex);
        }

    }

    private int parentIndex(int index)
    {
        return (index - 1)/2;
    }

    private int leftChildIndex(int index)
    {
        return 2*index+1;
    }

    private int rightChildIndex(int index)
    {
        return 2*index+2;
    }
}
