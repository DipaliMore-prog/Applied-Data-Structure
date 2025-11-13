public class CoinChange{
    public static void main(String args[])
    {
        int c[] = {20,10,5,2,1};
        int val = 83;
        int n = c.length;
        for(int i=0;i<n;i++)
        {
            while(val >= c[i])
            {
                System.out.print(c[i]+" ");
                val -= c[i];
            }
        }
    }
}