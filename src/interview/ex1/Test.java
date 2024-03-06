package interview.ex1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
        String someText = "Я из леса вышел \n"+
                "Был сильный мороз \n"+
                "Гляжу поднимается медлено в гору \n"+
                "Лошадка везущая хвороста воз \n";
        String path = "C:" +separator+"Users"+separator+"regul"+separator+"OneDrive"+separator+"Документы"+separator+"sourse_for_java.txt";
        File f1 = new File(path);

        FileWriter fW = null;
        try {
            fW = new FileWriter(f1);

            for (int i = 0; i < someText.length(); i++) {
                fW.write(someText.charAt(i));
            }
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fW.close();
        }


    }
}
