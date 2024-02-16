package kHosman.ar;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int n =5;
        int[][] ar = new int[n][];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = new int[i+1];
        }

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] =j+1;
            }
            System.out.println(Arrays.toString(ar[i]));
        }




    }
}
