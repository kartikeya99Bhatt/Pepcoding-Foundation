import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=scn.nextInt();
        int x=scn.nextInt();
        System.out.println(lastIndex(a,0,x));
    }

    public static int lastIndex(int[] arr, int idx, int x){
     if(idx==arr.length)return -1;
     int get=lastIndex(arr,idx+1,x);
     if(get!=-1)
     {
         return get;
     }
     else
     {
         if(arr[idx]==x)
         {
             return idx;
         }
         return get;
     }
     
    }

}
