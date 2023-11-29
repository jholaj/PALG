package experiments;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Cviko11_Utils1
{
    public static int[] timeSeriesFromFile(String fileName) throws IOException
    {
        Path path = Paths.get(System.getProperty("user.dir"),fileName);
        ArrayList<Integer> result = new ArrayList<>();

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for(String line: lines) {
            result.add(Integer.parseInt(line));
        }

        int[] res = new int[result.size()];
        for (int i=0;i<res.length;i++)
            res[i]=result.get(i);
        return res;
    }

    // najdi v poli nejbližší index, kde se hodnota rovná approxValue
    public static int findIndex(int[] values, int approxValue)
    {
        for (int i = 0; i < values.length; i++){
            if(values[i] >= approxValue){
                return i;
            }
        }
        return -1;
    }

    public static int findIndex1(int[] values, int approxValue)
    {
        int midIndex ;
        int midValue ;
        int startIndex = 0;
        int count = values.length;
        while (count > 1)
        {
            midIndex = startIndex + count/2;
            midValue = values[midIndex];
            if(midValue == approxValue)
            {
                return midIndex;
            }
            else if (midValue > approxValue)
            {
                count = count/2;
            }
            else
            {
                count = count - count/2;
                startIndex = midIndex;
            }
        }
        return startIndex;
    }


    public static int findIndex2(int[] values, int approxValue)
    {
        return findIndex(values, approxValue, 0, values.length);
    }

    private static int findIndex(int[] values, int approxValue, int startIndex, int count)
    {
        if (count == 1){
            return startIndex;
        }
        int midIndex = startIndex + count/2;
        int midValue = values[midIndex];

        if (midValue >= approxValue){
            return findIndex(values, approxValue, startIndex, count/2);
        }
        else{
            return findIndex(values, approxValue, midIndex, count - count/2);
        }
    }

}

