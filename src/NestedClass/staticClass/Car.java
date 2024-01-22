package NestedClass.staticClass;

public class Car {
    private static String strCar = "I am Car";
    String color;
    byte doorcount;
    Engine engene;

    public Car(String color, byte doorcount, Engine engen) {
        this.color = color;
        this.doorcount = doorcount;
        this.engene = engen;
    }

    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", doorcount=" + doorcount +
                ", engene=" + engene.toString() +
                '}';
    }
    public void getstrEngine (){
        System.out.println(Engine.strEngine);
    }


    public static class Engine{
        private static  String strEngine = " I am Engine in Car";
        int horsePower;
        public void getstrCar(){
            System.out.println(strCar);
        }
        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public String toString(){
            return " " + horsePower;
        }
    }
}
