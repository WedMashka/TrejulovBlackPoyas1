package interview.ex7Seriralization;

import java.io.File;

public class TestFileDell {
    public static void main(String[] args) {
        File file = new File("copyTestSerialization.bin");
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.isFile());
        System.out.println(file.equals(new File("copyTestSerialization.bin")));
        if(file.delete()){
            System.out.println("file deelited");
        }


    }
}
