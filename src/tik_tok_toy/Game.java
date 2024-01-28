package tik_tok_toy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    String[][] playingFeild = new String[5][5];;

        public void createFeild(){
            for (int i = 0;i <playingFeild.length; i++){
                for (int i1 = 0;i1 <playingFeild[i].length; i1++){
                    playingFeild[i][i1] = "   ";;
                    if (i%2!=0){
                        playingFeild[i][i1] ="---";
                    }
                    if (i1%2!=0){
                        playingFeild[i][i1] ="|";
                    }
                }
            }
        }

        public static void game(){
            Game start1 = new Game();
            start1.createFeild();
            for (int i = 0; i<10; i++) {
                if(checkVictoru(start1.playingFeild) == 1){
                    System.out.println("Cross");
                    start1.showFeild();
                    break;


                }else if (checkVictoru(start1.playingFeild) == 0){
                    System.out.println("Zero");
                    start1.showFeild();
                    break;


                }else if (checkVictoru(start1.playingFeild) == 2){
                    System.out.println("НИЧЬЯ ПОБЕДИЛА ДРУЖБА УРАААА!!!!!!!!");
                    start1.showFeild();
                    break;

                }else if(i % 2 == 0) {
                    PlayerCross.doSetCross(start1.playingFeild);
                    start1.showFeild();

                } else {
                    PlayerZero.doSetZero(start1.playingFeild);
                    start1.showFeild();
                }
            }
        }

        public static int checkVictoru(String[][] feild){
            if(checkToVinCross(feild)){
                return 1;
            }else if(checkToVinZero(feild)){
                return 0;
            }else if(checDraw(feild)){
                return 2;
            }else {
                return 8;
            }
        }

        public static boolean checkToVinCross(String[][] feild){
            if(feild[0][0].equals(" X ")  && feild[0][2].equals(" X ") && feild[0][4].equals(" X ") ||
                    feild[2][0].equals(" X ") && feild[2][2].equals(" X ") && feild[2][4].equals(" X ") ||
                    feild[4][0].equals(" X ") && feild[4][2].equals(" X ") && feild[4][4].equals(" X ") ||
                    feild[0][0].equals(" X ") && feild[2][0].equals(" X ") && feild[4][0].equals(" X ") ||
                    feild[0][2].equals(" X ") && feild[2][2].equals(" X ") && feild[4][2].equals(" X ") ||
                    feild[0][4].equals(" X ") && feild[2][4].equals(" X ") && feild[4][4].equals(" X ") ||
                    feild[0][0].equals(" X ") && feild[2][2].equals(" X ") && feild[4][4].equals(" X ") ||
                    feild[4][0].equals(" X ") && feild[2][2].equals(" X ") && feild[0][4].equals(" X ")
            ){
                System.out.println("КРЕСТИКИ ВЫИГРАЛИ УРАААА!!!!!!!!");
                return true;
            }else {
                return false;
            }
        }

    public static boolean checkToVinZero(String[][] feild){
        if(feild[0][0].equals(" 0 ")  && feild[0][2].equals(" 0 ") && feild[0][4].equals(" 0 ") ||
                feild[2][0].equals(" 0 ") && feild[2][2].equals(" 0 ") && feild[2][4].equals(" 0 ") ||
                feild[4][0].equals(" 0 ") && feild[4][2].equals(" 0 ") && feild[4][4].equals(" 0 ") ||
                feild[0][0].equals(" 0 ") && feild[2][0].equals(" 0 ") && feild[4][0].equals(" 0 ") ||
                feild[0][2].equals(" 0 ") && feild[2][2].equals(" 0 ") && feild[4][2].equals(" 0 ") ||
                feild[0][4].equals(" 0 ") && feild[2][4].equals(" 0 ") && feild[4][4].equals(" 0 ") ||
                feild[0][0].equals(" 0 ") && feild[2][2].equals(" 0 ") && feild[4][4].equals(" 0 ") ||
                feild[4][0].equals(" 0 ") && feild[2][2].equals(" 0 ") && feild[0][4].equals(" 0 ")
        ){
            System.out.println("НОЛИКИ ВЫИГРАЛИ УРАААА!!!!!!!!");
            return true;
        }else {
            return false;
        }
    }

    public static boolean checDraw(String[][] feild){
        List<String> listCoordinat = new ArrayList<>();
        for(int i =0; i<feild.length;i++){
            for(int i1 =0; i1<feild[i].length;i1++){
                listCoordinat.add(feild[i][i1]);
            }
        }
        return !listCoordinat.contains("   ");
    }



        public void showFeild(){
            for (int i = 0; i<playingFeild.length; i++){
                for (int i1 = 0; i1<playingFeild.length; i1++){
                    System.out.print(playingFeild[i][i1]);
                }
                System.out.println();
            }
        }






}
