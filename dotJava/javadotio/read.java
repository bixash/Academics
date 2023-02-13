import java.io.*;


public class read {
    


    public static void main(String[] args)
    {
        String fname = "bba.txt";
        String line = null;
        try
        {
            FileReader fileReader = new FileReader(fname);
            
            // always wrap the FileReader in BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            
            // always close the file after its use
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("\nError occurred");
            System.out.println("Exception Name: " +ex);
        }
    }

}
