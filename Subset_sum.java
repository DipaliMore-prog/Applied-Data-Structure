public class Subset_sum
{
    public static void main(String args[])
    {
        
        int set[] = {2,5,3};
        int n = 3;
        int sum = 5;
        boolean dp[][] = new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            dp[i][0] = true;
        }
        for(int j=1;j<=sum;j++)
        {
            dp[0][j] = false;
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(set[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-set[i-1]];
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        if(dp[n][sum])
            System.out.println("Output : True ");
        else
             System.out.println("Output : False ");

    }
}