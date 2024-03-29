import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean [][]visited=new boolean[n][m];
        floodfiell(arr, 0, 0, "",visited);
    }
    
    // asf -> answer so far
    public static void floodfiell(int[][] maze, int sr, int sc, String asf,boolean [][]visited) {
       if(sr<0 || sr==maze.length || sc<0 || sc==maze[0].length|| maze[sr][sc]==1 ||visited[sr][sc]==true)
       {
           return ;
       }
       else if(sr==maze.length-1 && sc==maze[0].length-1)
       {
           System.out.println(asf);
           return ;
       }
       visited[sr][sc]=true;
       floodfiell(maze,sr-1,sc,asf+'t',visited);
       floodfiell(maze,sr,sc-1,asf+'l',visited);
       floodfiell(maze,sr+1,sc,asf+'d',visited);
       floodfiell(maze,sr,sc+1,asf+'r',visited);
       visited[sr][sc]=false;
    }
}
