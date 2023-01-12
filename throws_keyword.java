public class throws_keyword {

    void divide(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else{
            System.out.println(a/b);
        }
    }
    public static void main(String[] args) 
    {
        throws_keyword a = new throws_keyword();
        
        try
        {
            
            a.divide(2,0);

        } catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
