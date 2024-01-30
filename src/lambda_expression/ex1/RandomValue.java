package lambda_expression.ex1;

public class RandomValue {
    static void outInfo(Str objStr){
        System.out.println(objStr.st("Lanos is good car"));
    }
    public static void main(String[] args) {

        outInfo((String s)->{return String.valueOf(s.length());});
    }
}


interface Str{
    String st(String st);
}
