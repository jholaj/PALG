package experiments;

import java.util.NoSuchElementException;

public class Cviko08_Heap {
    private Cviko08_HeapNode[] data;
    private int count;

    public Cviko08_Heap(int capacity) {
        data = new Cviko08_HeapNode[capacity];
        count = 0;
    }

    public void insert(double key, Cviko05_Item payload) {
        if (count >= data.length) {
            throw new IndexOutOfBoundsException();
        }
        //Krok 1: ulož nový prvek na konec haldy
        Cviko08_HeapNode newNode = new Cviko08_HeapNode(payload, key);
        data[count] = newNode;
        count++;
        //Krok 2: Posuň nahoru když potřeba
        repairUp(count - 1);
    }

    public Cviko05_Item getMin()
    {
        if(count == 0){
            throw new NoSuchElementException();
        }
        return data[0].getPayload();
    }

    public Cviko05_Item extractMin()
    {
        if(count==0) throw new NoSuchElementException();
        // KROK 1: Smazat kořen a na pozici 0 dát to, co bylo na konci haldy
        Cviko05_Item temp = data[0].getPayload();
        data[0] = data[count-1];
        count--;
        repairDown(0);
        return temp;
    }

    private void swap(int i1, int i2){
        Cviko08_HeapNode temp = data[i1];
        data[i1] = data[i2];
        data[i2] = temp;

    }

    private void repairUp(int index)
    {
        int parentIndex = parentIndex(index);
        if(data[parentIndex].getKey() > data[index].getKey()){
            swap(index,parentIndex);
            repairUp(parentIndex);
        }
    }

    private void repairUp1(int index)
    {
    }

    private void repairDown(int index)
    {
        int leftChildIndex = leftChildIndex(index);
        int rightChildIndex = rightChildIndex(index);
        if(rightChildIndex < count
                && data[leftChildIndex].getKey() >= data[rightChildIndex].getKey()
                && data[rightChildIndex].getKey() < data[index].getKey())
        {
            swap(rightChildIndex,index);
            repairDown(rightChildIndex);

        }
        else if(leftChildIndex < count
                && data[rightChildIndex].getKey() >= data[leftChildIndex].getKey()
                && data[leftChildIndex].getKey() <data[index].getKey())
        {
            swap(leftChildIndex,index);
            repairDown(leftChildIndex);
        }

    }


    private int parentIndex(int index)
    {
        return (index - 1) / 2;
    }

    private int leftChildIndex(int index)
    {
        return 2 * index + 1;
    }

    private int rightChildIndex(int index)
    {
        return 2*index + 2;
    }
}
