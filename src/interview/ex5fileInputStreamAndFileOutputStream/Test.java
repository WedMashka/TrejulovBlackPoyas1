package interview.ex5fileInputStreamAndFileOutputStream;
import interview.ex3TryWithResourses.TestBufferedReaAndWrite;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        String path ="C:\\Users\\regul\\OneDrive\\Pictures\\Изображение WhatsApp 2024-02-08 в 13.44.14_cb00d487.jpg";
        File fileIn = new File(TestBufferedReaAndWrite.getGoodPathIn(path));
        File fileOut = new File(TestBufferedReaAndWrite.getGoodPathOut(path));

        try(FileInputStream readerFile = new FileInputStream(fileIn);
        FileOutputStream writeFile = new FileOutputStream(fileOut);) {
            int val;
            while ((val = readerFile.read())!= -1){
                writeFile.write(val);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
