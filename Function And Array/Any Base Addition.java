import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       int ans=0;
       int c=0;
       int temp=1;
       while(n1>0 || n2>0 || c>0)
       {
           int rem1=n1%10;
           int rem2=n2%10;
           int s=rem1+rem2+c;
           int rem=s%b;
           c=s/b;
           ans+=rem*temp;
           temp=temp*10;
           n1=n1/10;
           n2=n2/10;
       }
       return ans;
   }
  }
