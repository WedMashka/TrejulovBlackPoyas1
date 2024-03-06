package interview.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        String someText = "Я из леса вышел \n"+
                "Был сильный мороз \n"+
                "Гляжу поднимается медлено в гору \n"+
                "Лошадка везущая хвороста воз \n";
        String separator = File.separator;
        String path = "C:" +separator+"Users"+separator+"regul"+separator+"OneDrive"+separator+"Документы"+separator+"sourse_for_java2.txt";

        FileWriter fW = null; //создаем переменную для стрима, отдельно для того что бы можно было закрытькрасивов finally
        try {
            fW = new FileWriter(path, true); //создает стрим? если файла нет он создастся
                fW.write(someText, 10,20); // что записать, индекс символа с какого начать, сколько символов запсиать
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fW.close(); //закрвывет стрим
        }




    }
}
