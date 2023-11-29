package experiments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cviko10_Utils
{
    public static Comparable[] makeCopy(Comparable[] source, int start, int count)
    {
        Comparable[] result = new Comparable[count];
        for(int i= 0; i < count; i++)
        {
            result[i] = source[start+i];
        }

        return result;
    }

    public static void merge(
            Comparable[] target,
            int targetStart,
            Comparable[] source1,
            Comparable[] source2)
    {
        if(targetStart+source1.length+source2.length > target.length)
        {
            throw new IndexOutOfBoundsException();
        }
        int pointer1 = 0;
        int pointer2 = 0;
        for(int t=0; t<source1.length+source2.length; t++)
        {
            if(pointer1 >= source1.length)
            {
                target[targetStart+t] = source2[pointer2++];
            }
            else if(pointer2 >= source2.length)
            {
                target[targetStart+t] = source1[pointer1++];
            }
            else if (source1[pointer1].compareTo(source2[pointer2]) < 0)
            {
                target[targetStart+t] = source1[pointer1++];
            }
            else
            {
                target[targetStart+t] = source2[pointer2++];
            }
        }
    }

    public static Comparable[] exampleTexts(int count) throws FileNotFoundException
    {
        ArrayList<Comparable> result = new ArrayList<>();
        String path = System.getProperty("user.dir")+"/main/java/experiments/sample03.txt";
        Scanner scanner = new Scanner(new File(path));
        int i=0;
        while (scanner.hasNextLine() && i<count)
        {
            result.add( new Cviko10_ComparableText(
                    scanner.nextLine()));
            i++;
        }
        return result.toArray(new Comparable[0]);
    }
}
