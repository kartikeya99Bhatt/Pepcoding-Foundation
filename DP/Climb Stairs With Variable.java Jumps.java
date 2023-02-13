// RECURSION
// n =givin
// st=0;
// arr given
public static int climbStair(int n,int st,int []arr)
    {
        if(n==st)
        {
            return 1;
        }
        int val=0;
       for(int sp=1;sp<=arr[st];sp++)
       {
           if(st+sp<=n)
           {
               val+= climbStair(n,st+sp,arr);
           }
           else
           {
               return 0;
           }
       }
       return val;
    }

// MEMOIZATION

 public static int climbStair(int n,int st,int []dp,int []arr)
    {
        if(n==st)
        {
            return 1;
        }
        else if(dp[st]!=0)
        {
            return dp[st];
        }
        int val=0;
       for(int sp=1;sp<=arr[st];sp++)
       {
           if(st+sp<=n)
           {
               val+= climbStair(n,st+sp,dp,arr);
           }
           else
           {
               return val;
           }
       }
       
       dp[st]=val;
       return dp[st];
    }



// TABULATION
