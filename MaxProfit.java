import java.util.*;
class MaxProfit {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter No.of days to buy or sell the stocks :");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Rate of stocks for each day :");
        for(int i=0;i<n;i++)
        {
           arr[i] = sc.nextInt();
        }
        int result = maxProfit(arr,n);
        if(result == 0)
        {
            System.out.println("Loss is Obtain");
        }
        else
        {
             System.out.println("profit is : "+result);
 
        }
    }


    public static int maxProfit(int arr[],int n)
    {
        int maxprice = arr[n-1];
        int profit = 0;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i] < maxprice)
            {
                profit += maxprice - arr[i];
                
            }
            else
            {
                 maxprice = arr[i];
            }
            
        }
        return profit;
    
        
    }
    
}
