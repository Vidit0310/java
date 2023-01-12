public class factorail {
    int fact(int f)
    {
        if(f<=1)
        {
            return 1;
        }
        else
        {
            return f *  fact(f-1);
        }
        
    }
    public static void main (String[] args)
    {
        int result ;
        factorail o1 = new factorail();
        result = o1.fact(5);        
        System.out.println(result);
    } 
}
