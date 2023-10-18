package experiments;

public class Cviko05_ListNode
{
    private Cviko05_Item payload;
    private Cviko05_ListNode nextNode;

    public Cviko05_ListNode(Cviko05_Item payload, Cviko05_ListNode nextNode) {
        this.payload = payload;
        this.nextNode = nextNode;
    }

    public Cviko05_Item getPayload() {
        return payload;
    }

    public Cviko05_ListNode getNextNode() {
        return nextNode;
    }
}
