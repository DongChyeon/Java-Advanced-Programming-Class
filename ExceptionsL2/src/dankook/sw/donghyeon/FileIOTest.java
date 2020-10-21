package dankook.sw.donghyeon;

import java.io.FileReader;
import java.io.IOException;

public class FileIOTest {
    public void openFile(){
        FileReader reader = null;
        try {
            // constructor may throw FileNotFoundException
            reader = new FileReader("data.txt");
            int i = 0;
            while(i != -1){
                //reader.read() may throw IOException
                i = reader.read();
                System.out.println((char) i );
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("--- File End ---");
        }
    }
}
