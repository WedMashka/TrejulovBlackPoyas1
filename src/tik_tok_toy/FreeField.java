package tik_tok_toy;

import java.util.*;

public class FreeField {
    public static List<Integer> findFreeFeild(String[][] feild){
        List<String> inex1Index2 = new ArrayList<>();
        for (int i =0; i<feild.length; i++){
            for (int i1 =0; i1<feild[i].length; i1++){
                if(feild[i][i1].contains("   ")){
                    inex1Index2.add(i + "," +i1);
                }
            }
        }
        Random random = new Random();
        String coordinate = inex1Index2.get(random.nextInt(inex1Index2.size()));
        String[] arrayCoordinate = coordinate.split(",");
        List<Integer> coordinateInt = new ArrayList<>();
        coordinateInt.add(Integer.parseInt(arrayCoordinate[0]));
        coordinateInt.add(Integer.parseInt(arrayCoordinate[1]));
        return coordinateInt;
    }
}
