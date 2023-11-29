package experiments;

import java.io.FileNotFoundException;
import java.util.Random;

public class Cviko10
{
    public static void main(String[] args) throws FileNotFoundException {
        Comparable[] exampleTexts = Cviko10_Utils.exampleTexts(100);
        Cviko09_Sorter s = new Cviko10_MergeSorter();
        s.sortWithReport(exampleTexts);
    }
}
