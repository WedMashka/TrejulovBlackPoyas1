package lambda_expression.ex1;

public class Test2 {

    static void showLenght(String s, K k){
        System.out.println(k.l(s));
    }

    public static void main(String[] args) {
        showLenght("Chevrolet",(s)->{return s.length();});
    }
}

interface K{
    int l(String s);
}