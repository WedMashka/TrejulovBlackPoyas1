package interview.ex2FileReader;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        String path = "C:" +separator+"Users"+separator+"regul"+separator+"OneDrive"+separator+"Документы"+separator+"reader_for_java3.txt";

        String someText = "устройство или удаленный сервер";

        File file = new File(path);

        FileWriter fileWriter1 = null;

        try {
            fileWriter1 = new FileWriter(file);
            fileWriter1.write(someText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileWriter1.close();
        }

        FileReader fileReader1 = null;
        StringBuilder res = new StringBuilder();
        try {
            fileReader1 = new FileReader(file, StandardCharsets.UTF_8);

            int val;
            while ((val = fileReader1.read()) != -1){ // кастим до инта потом до чара  иначе абракадабра выйдет
                res.append((char) val);
            }
        } catch (FileNotFoundException e){
            System.out.println(e.fillInStackTrace());
        } finally {
            fileReader1.close();
        }

        System.out.println(res);


    }
}
