// to run java debugger file should be outside package
// to run code runner file shild be in same folder

import java.io.*;


public class bytestream {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        // File test= new File("check.txt");
        // if (test.createNewFile()) {
        //     System.out.println("File created: " + test.getName());
        // }


        try {
            
            in = new FileInputStream("bca.txt");
            out = new FileOutputStream("check.txt");
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