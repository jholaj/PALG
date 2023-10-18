package experiments;

public class Cviko05_Item
{
    private final double[] coords;
    private final String name;

    public Cviko05_Item(double[] coords, String name)
    {
        this.name = name;
        this.coords = coords;
    }

    public double[] getCoords() {
        return coords;
    }
}
