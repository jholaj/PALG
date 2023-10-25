package experiments;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Cviko05_List implements Iterable<Cviko05_Item>
{
    private Cviko05_ListNode firstNode;
    private int _size;

    public void addFirst(Cviko05_Item payload)
    {
        firstNode = new Cviko05_ListNode(payload, firstNode);
        _size++;
    }

    public Cviko05_Item removeFirst() {
        if(_size == 0){
            throw new NoSuchElementException();
        }
        Cviko05_ListNode temp = firstNode;
        firstNode = firstNode.getNextNode();
        _size--;
        return temp.getPayload();
    }

    public Cviko05_Item removeLast(){

        if(_size == 0){
            throw new NoSuchElementException();
        }

        Cviko05_ListNode node = firstNode;
        //Dojdi k předposlednímu uzlu
        for (int i = 0; i < _size - 1; i++) {
            node = firstNode.getNextNode();
        }

        Cviko05_ListNode lastNode = node.getNextNode();
        node.setNextNode(null);
        _size--;
        return lastNode.getPayload();
    }

    public int size() {
        return _size;
    }

    public Cviko05_Item get(int index) {

        Cviko05_ListNode currentNode = this.firstNode;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
            if(currentNode == null){
                throw new IndexOutOfBoundsException();
            }
        }

        return currentNode.getPayload();
    }

    public Iterator<Cviko05_Item> iterator(){
        return new Cviko05_ListIterator(firstNode);
    }
}
