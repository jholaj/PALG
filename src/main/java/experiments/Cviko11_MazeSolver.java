package experiments;

public class Cviko11_MazeSolver
{
    private final int sizeX;
    private final int sizeY;
    private int [][] maze;
    private boolean found = false;

    public Cviko11_MazeSolver(int[][] maze)
    {
        this.maze = maze;
        this.sizeY = maze.length;
        this.sizeX = maze[0].length;
        // maze[y][x]
    }

    boolean isAvailable(int x, int y)
    {
        // TODO: Oprav metodu
        // priorita AND je větší jak OR
        boolean validIndex = 0 <= x && x < sizeX && 0 <= y && y < sizeY;
        return validIndex && (maze[y][x] == 0 || maze[y][x] == -1);
    }

    void move(int k, int x, int y)
    {
        if(maze[y][x] == -1){
            found = true;
            return;
        }

        maze[y][x] = k;

        if(!found && isAvailable(x-1,y)){
            move(k + 1, x - 1, y);
        }

        if(!found && isAvailable(x+1, y)) {
            move(k + 1, x + 1, y);
        }

        if(!found && isAvailable(x, y-1)) {
            move(k + 1, x, y-1);
        }

        if(!found && isAvailable(x, y+1)) {
            move(k + 1, x, y+1);
        }

        if(found){
            System.out.println("X: " + y +"," + " Y: " + x);
        }

    }

    public void go()
    {
        Cviko11_Utils2.printMaze(maze);
        move(1,0,0);
        Cviko11_Utils2.printMaze(maze);
        System.out.println(found ? "FOUND" : "NOT FOUND");
    }
}
