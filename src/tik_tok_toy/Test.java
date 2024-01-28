package tik_tok_toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        sc1.nextInt();
        while (sc1.hasNextLine()){
            Game.game();
            System.out.println("хочешь еще нажми любую цифру");
            sc1.nextInt();
        }

    }
}
