import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int []dp=new int[n+1];
      solve(dp);
    }
    public static void solve(int []dp)
    {
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<dp.length;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[dp.length-1]);
    }
}