package experiments;

import java.util.Iterator;

public class Cviko05_ListIterator
        implements Iterator<Cviko05_Item>
{

    Cviko05_ListNode nextNode;

    public Cviko05_ListIterator(Cviko05_ListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public boolean hasNext() {
        return nextNode != null;
    }

    @Override
    public Cviko05_Item next() {
        Cviko05_Item p = nextNode.getPayload();
        nextNode = nextNode.getNextNode();
        return p;
    }
}
