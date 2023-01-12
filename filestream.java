import java.io.*;

class filestream
{
    public static void main(String[] args )
    {
        //creating new file "textfile.txt" and writing data     into it
        try 
        {
            FileOutputStream fwrite = new FileOutputStream("textfile.txt") ;
            String s = "hello \nworld";
            fwrite.write(s.getBytes());
            fwrite.close();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }


        // reading data from file "textfile.txt" 
        try 
        {
            FileInputStream fread = new FileInputStream("textfile.txt"); 
            
            int count;
            while((count = fread.read()) != -1)
            {
                System.out.print((char)count);
            }
            fread.close();
        } 

        catch (IOException e)
        {
            e.printStackTrace();
        } 


        // creating second new file "copydata.txt" and copy data of "textfile.txt"
        try 
        {
            int count;
            FileOutputStream fwrite2 = new FileOutputStream("copydata.txt") ;
            FileInputStream fread2 = new FileInputStream("textfile.txt");
            while((count = fread2.read()) != -1)
            {

                fwrite2.write(count);
            }
            fwrite2.close();
            fread2.close();
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}