public class prime_number {
    public static void main (String[] args)
    {
    

        for (int i = 2; i <=100 ;i++)
        {
            // System.out.println(i);
            int count = 0;
            for (int j = 2; j <i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
                if(count==2)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
