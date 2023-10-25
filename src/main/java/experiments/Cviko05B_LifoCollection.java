package experiments;

public class Cviko05B_LifoCollection implements Cviko05B_InOutCollection
{
    Cviko05_List list = new Cviko05_List();
    @Override
    public void in(Cviko05_Item item) {
        list.addFirst(item);
    }

    @Override
    public Cviko05_Item out() {
        return list.removeFirst();
    }
}
