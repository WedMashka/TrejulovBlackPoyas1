package stream.ex6Chainihg;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        int[] arI = {(int)(Math.random()*10)+2,(int)(Math.random()*10)+2,(int)(Math.random()*10)+2,
                (int)(Math.random()*10)+2,(int)(Math.random()*10)+2,(int)(Math.random()*10)+2,
                (int)(Math.random()*10)+2,(int)(Math.random()*10)+2,(int)(Math.random()*10)+2};

        System.out.println(Arrays.toString(arI));

        int res = Arrays.stream(arI).filter((el)->{
            return el%2 ==1;
        }).map((el)->{
            if(el%3==0){
                el =el/3;
            }
            return el;
        }).reduce((a,e)->{
            return a+e;
        }).getAsInt();

        System.out.println(res);

    }
}























