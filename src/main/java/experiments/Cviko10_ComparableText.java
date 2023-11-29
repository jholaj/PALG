package experiments;
public class Cviko10_ComparableText
        implements Comparable
{
    private final String value;
    public Cviko10_ComparableText(String value)
    {
        this.value = value;
    }

    public int compareTo(Object o)
    {
        Cviko10_ComparableText other = (Cviko10_ComparableText) o;
        return this.value.length() - other.value.length();
    }

    @Override
    public String toString() {
        return value;
    }
}
