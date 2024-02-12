package stream.ex2;

public class Flovers {
    String name;
    int value;

    public Flovers(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
