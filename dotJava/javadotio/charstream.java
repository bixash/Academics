
import java.io.*;


public class charstream {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;

        // File test= new File("check.txt");
        // if (test.createNewFile()) {
        //     System.out.println("File created: " + test.getName());
        // }


        try {
            
            in = new FileReader("bca.txt");
            out = new FileWriter("bba.txt");
            int c;

            while ((c=in.read())!= -1) {
                out.write(c);
                System.out.print(c);
            }
        } 
        finally {
            if(in != null)
                in.close();
            if(out != null)
                out.close();

        }
    }
}

