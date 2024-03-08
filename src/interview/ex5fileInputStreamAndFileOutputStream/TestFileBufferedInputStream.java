package interview.ex5fileInputStreamAndFileOutputStream;

import java.io.*;

public class TestFileBufferedInputStream {
    public static void main(String[] args) {
        String path = "C:\\Users\\regul\\OneDrive\\Desktop\\4604fa2792d557410ca1e57e67e62e8b.jpeg";

        File fileIn = new File(path);
        File fileOut = new File("7e62e8b.jpeg");

        try (BufferedInputStream reader = new BufferedInputStream(new FileInputStream(fileIn));
        BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(fileOut));) {
            int  val;
            while ((val = reader.read())!= -1){
                writer.write(val);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
