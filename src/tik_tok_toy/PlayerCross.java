package tik_tok_toy;

import java.security.Key;
import java.util.*;

public class PlayerCross {

    public static void setCross(String[][] feild, List<Integer> coordinate){
        feild[coordinate.get(0)][coordinate.get(1)] = " X ";
    }
    public static void doSetCross(String[][] feild){
        List<Integer> coordinate = FreeField.findFreeFeild(feild);
        setCross(feild,coordinate);
    }
}
