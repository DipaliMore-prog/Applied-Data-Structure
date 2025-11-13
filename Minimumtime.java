 class Minimumtime{
    public static void main(String args[])
    {
    int arr[]={3,4,15,17};
    int min=arr[0];
    int days =6;
    int day = 0,n=4;
    for(int i=0;i<n;i++)
    {
        int count = 0;
        if(arr[i]<=min)
        {
            day++;
        }
        else
        { 
            int ans = arr[i]/min;
            if(ans != 0)
            {
                day =day +ans;
            }
        }
        if(day > days)
        {
            min = arr[++count];
        }
        
    }
    
    System.out.println(min);


}
    
}
