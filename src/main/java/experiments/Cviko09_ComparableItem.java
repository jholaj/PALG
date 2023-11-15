package experiments;

import java.util.Locale;

public class Cviko09_ComparableItem implements Comparable
{
    private final double value;

    public Cviko09_ComparableItem(double value)
    {
        this.value = value;
    }

    public int compareTo(Object o)
    {
        Cviko09_ComparableItem other = (Cviko09_ComparableItem)o;
        return Double.compare(value, other.value);
    }

    public String toString()
    {
        return String.format(
                Locale.ENGLISH,
                "%1$,.2f",
                value);
    }
}
