package interview.ex3TryWithResourses;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestWrite {
    public static void main(String[] args) {
        String quote = "Счастье можно найти даже в самые тёмные времена. Просто не забывайте зажечь свет (Профессор Альбус Дамблдор).\n" +
                "\n" +
                "Лишь ценность твоих убеждений определяет успех, а не количество сторонников (Профессор Римус Люпин перед битвой с Волан-де-Мортом).\n" +
                "\n" +
                "В каждом из нас есть и свет, и тьма. Значение имеет лишь то, какую сторону мы выберем (Сириус Блэк).\n" +
                "\n" +
                "Выбор, который мы делаем, Гарри, говорит о нас больше, чем наши способности (Профессор Альбус Дамблдор).\n" +
                "\n" +
                "Недоверие к друзьям — вершина бесчестья (Профессор Альбус Дамблдор).";
        String sep = File.separator;
        String path = "quote.txt";
        File fileQuote = new File(path);

        try(FileWriter write = new FileWriter(fileQuote, true);) {
            write.write(quote);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
