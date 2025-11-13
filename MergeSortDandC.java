class MergeSortDandC
{
    public static void divide(int arr[],int low,int high)
    {
        if(low >= high)
        {
            return;
        }
        int mid = low + (high - low)/2;
        divide(arr,low,mid);
        divide(arr,mid+1,high);
        conquer(arr,low,mid,high);
    }
    public static void conquer(int arr[],int low,int high,int mid)
    {
        int merged[] = new int[high-low+1];
        int i=low;
        int j=mid+1;
        int x=0;
        while(i<=mid && j<=high)
        {
            if(arr[i] > arr[j])
            {
                merged[x++] = arr[j++];
            }
            else{
                merged[x++] = arr[i++];
  
            }
        }
        while(i<=mid)
        {
             merged[x++] = arr[i++];
        }
        while(j<=high)
        {
             merged[x++] = arr[i++];

        }
        for(int k=0 ,l=low;k<merged.length;k++,l++)
        {
            arr[l] = merged[k];
        }

    }
    public static void main(String args[])
    {
        int arr[] = {6,3,5,2,8,9};
        int n = arr.length;
        divide(arr,0,n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}