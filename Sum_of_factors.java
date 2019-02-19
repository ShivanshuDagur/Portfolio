public class Sum_of_factors
{
    public static void main(String args[])
    {
        int n = 30;
        int sum = 0,i = 2;

        while(n > 1)
        {
            if (n % i == 0)
            {
                sum = sum + i;
                n = n / i;
                i = 2;
            }
            else
            {
                i++;
            }
            
        }
        System.out.println(sum);
    }

}