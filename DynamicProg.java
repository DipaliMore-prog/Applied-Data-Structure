class DynamicProg
{
    public static void main(String args[])
    {
        int dp[][] = new int[100][100];
        int c[] = {2,5,3,6};
        int n = c.length;
        int sum = 10;
        for(int i=0;i<n;i++)
        {
            dp[i][0] = 1;
        }
        for(int j=1;j<=sum;j++)
        {
            dp[0][j] = 0;
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=sum;j++)
            {
                if(c[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j] + dp[i][j-c[i-1]];
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println("Output : "+dp[n][sum]);
    }
}