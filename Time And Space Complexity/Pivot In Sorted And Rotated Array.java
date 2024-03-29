
  public static int findPivot(int[] arr) {
    // write your code here
    int lo=0;int hi=arr.length-1;
    while(lo<hi)
    {
        int mid=(lo+hi)/2;
        
        if(arr[mid]<arr[hi])
        {
            hi=mid;
        }
        else
        {
            lo=mid+1;
        }
    }
    return arr[lo];
  }
