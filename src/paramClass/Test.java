package paramClass;

public class Test {

    public static void main(String[] args) {
        ParametratherClass<Integer, String> season = new ParametratherClass<>(2, "Spring");
        int i = season.getKey();
        String v =  season.getValue();
        System.out.println(i+" "+v);
    }

}
