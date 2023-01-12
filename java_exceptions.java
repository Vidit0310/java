public class java_exceptions
{

    void check(int a)
    {
        if (a <18)
        {
            throw new  ArithmeticException("Caught Inside function");
        }
        else
        {
            System.out.println("ok");
        }

    }
    public static void main(String[] args) 
    {
    

        try
        {
            java_exceptions a = new java_exceptions();
            java_exceptions b = new java_exceptions();

            a.check(18);
            b.check(16);

    
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught Outside function");
        }

    }
    

    
}
