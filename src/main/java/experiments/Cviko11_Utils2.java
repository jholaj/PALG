package experiments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cviko11_Utils2
{
    public static int[][] mazeFromFile(String fileName) throws FileNotFoundException
    {
        String path = System.getProperty("user.dir")+"/"+fileName;
        Scanner scanner = new Scanner(new File(path));
        ArrayList<int[]> result = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            char[] parts= line.toCharArray();
            int[] row = new int[parts.length];
            for (int i=0; i<parts.length; i++)
            {
                if(parts[i]=='.' || parts[i]==' ' || parts[i]=='░')
                    row[i]=0;
                else if(parts[i]=='X')
                    row[i]=-1;
                else
                    row[i]=-4;
            }
            result.add(row);
        }

        return result.toArray(new int[0][]);
    }

    static void printMaze(int[][] maze)
    {
        for(int y = 0; y < maze.length; y++)
        {
            for(int x = 0; x < maze[y].length; x++)
            {
                if(maze[y][x]==-4)
                    System.out.print("██");
                else if(maze[y][x]==-1)
                    System.out.print("XX");
                else if(maze[y][x]==0)
                    System.out.print("░░");
                else
                    System.out.format("%2d", maze[y][x]);
                System.out.print(" ");

            }
            System.out.println();
        }
        System.out.println();
    }

}

