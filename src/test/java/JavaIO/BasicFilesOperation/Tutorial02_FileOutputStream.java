package JavaIO.BasicFilesOperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

public class Tutorial02_FileOutputStream {
    public static void main(String[] args) throws IOException {

        String fileData = "Data";
        File file;
        FileOutputStream fis=new FileOutputStream("testFile2");
        //If you want to create a new file and at the same time write some data into it, you can use FileOutputStream write method
        fis.write ( fileData.getBytes () );
        fis.flush ();
        fis.close ();
    }
}
