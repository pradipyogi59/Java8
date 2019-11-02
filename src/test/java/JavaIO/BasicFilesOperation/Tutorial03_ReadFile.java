package JavaIO.BasicFilesOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Tutorial03_ReadFile {
    public static void main(String[] args) throws IOException {


        String file=System.getProperty ( "user.dir" )+"//testFil1.txt";
        //or String file="testFil1.txt";

        FileReader fis=new FileReader(file);
        BufferedReader br = new BufferedReader(fis);
        String data;

        while ((data=br.readLine ()) != null)
        {
            System.out.println (data );
        }

    }
}
