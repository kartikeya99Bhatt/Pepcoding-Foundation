import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        
        int [][]arr=new int[n][m];
        int [][]dp=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
       solve(arr,dp);
       System.out.println(dp[0][0]);
    }
    public static void solve(int [][]arr,int [][]dp)
    {
        int n=arr.length;
        int m=arr[0].length;
        
        for(int i=n-1;i>=0;i--)
        {
            for(int j=m-1;j>=0;j--)
            {
               
                if(i==n-1 && j==m-1)
                {
                    dp[i][j]=arr[i][j];
                }
                else if(i==n-1)
                {
                    dp[i][j]=dp[i][j+1]+arr[i][j];
                }
                else if(j==m-1)
                {
                    dp[i][j]=dp[i+1][j]+arr[i][j];
                }
                else
                {
                   dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j]; 
                }
            }
        }
    }

}
