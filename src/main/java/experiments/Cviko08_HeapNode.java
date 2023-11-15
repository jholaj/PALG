package experiments;

public class Cviko08_HeapNode
{
    private Cviko05_Item payload;
    private double key;

    public Cviko08_HeapNode(Cviko05_Item payload, double key)
    {
        this.payload = payload;
        this.key = key;
    }

    public Cviko05_Item getPayload() {
        return payload;
    }

    public void setPayload(Cviko05_Item payload) {
        this.payload = payload;
    }

    public double getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }
}
