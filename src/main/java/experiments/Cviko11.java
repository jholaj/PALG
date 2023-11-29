package experiments;

import java.io.IOException;

public class Cviko11
{
    public static void main(String[] args) throws IOException
    {

//        int[] values = Cviko11_Utils1.timeSeriesFromFile("sample05.txt");
//        int index=Cviko11_Utils1.findIndex1(values, 23698396);
//        System.out.println("Index: "+index);
//        System.out.println("Hodnota před:" + values[index-1]);
//        System.out.println("Hondota na:" +values[index]);
//
//        int index2=Cviko11_Utils1.findIndex2(values, 23698396);
//        System.out.println("Index: "+index2);
//        System.out.println("Hodnota před:" + values[index2-1]);
//        System.out.println("Hondota na:" +values[index2]);

        // 0: volno, -4: zeď, -1: cíl
        int[][] maze = Cviko11_Utils2.mazeFromFile("sample04.txt");
        Cviko11_MazeSolver solver = new Cviko11_MazeSolver(maze);
        solver.go();
    }
}
