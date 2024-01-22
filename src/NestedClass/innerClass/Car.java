package NestedClass.innerClass;

public class Car {
    private static String strCar = "I am Car";
    String color;
    byte doorcount;
    Engine engene;

    public Car(String color, byte doorcount, int horsePower) {
        this.color = color;
        this.doorcount = doorcount;
        this.engene = this.new Engine(horsePower);

    }
    public Car(String color, byte doorcount) {
        this.color = color;
        this.doorcount = doorcount;

    }

    public void setEngene(Engine engene) {
        this.engene = engene;
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


    public  class Engine{
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
