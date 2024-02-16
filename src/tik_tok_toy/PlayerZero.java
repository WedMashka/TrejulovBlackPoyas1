package tik_tok_toy;

import java.util.List;

public class PlayerZero {
    public static void setZero(String[][] feild, List<Integer> coordinate){
        feild[coordinate.get(0)][coordinate.get(1)] = " 0 ";
    }
    public static void doSetZero(String[][] feild){
        List<Integer> coordinate = FreeField.findFreeFeild(feild);
        setZero(feild,coordinate);
    }
}
