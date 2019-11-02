package JavaIO.BasicFilesOperation;

import java.io.File;
import java.io.IOException;

public class Tutorial01_CreateFile {

    public static void main(String[] args) throws IOException {

        File file=new File("testFil1.txt");
        //absolute file path or like above
        if (file.createNewFile ()){
            System.out.println ("File Created" );
        }else {
            System.out.println ("File Not Created" );
        }
    }
}
