class CountZero{
    public static int countZeroes(int arr[],int low,int high)
    {
        int firstzero = -1;
       int n = arr.length;
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]==0)
            {
                firstzero = mid;
                high = mid-1;
            }
            else
            {
                low=mid+1;
        
            }
        }
        if(firstzero == -1)
        return 0;

        return n-firstzero;
    }
    public static void main(String args[])
    {
        int arr[] = {1,1,1,0,0,0,0,0,0};
        int n = arr.length;
        int result=countZeroes(arr,0,n-1);
       System.out.println("No.of zeroes followed by 1's = "+result);
        
    }
}