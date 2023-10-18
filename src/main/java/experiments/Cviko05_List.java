package experiments;

public class Cviko05_List
{
    private Cviko05_ListNode firstNode;
    private int _size;

    public void addFirst(Cviko05_Item payload)
    {
        firstNode = new Cviko05_ListNode(payload, firstNode);
        _size++;
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
}
