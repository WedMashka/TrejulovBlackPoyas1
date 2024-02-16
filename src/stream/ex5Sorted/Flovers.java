package stream.ex5Sorted;

import java.util.Objects;

public class Flovers implements Comparable<Flovers>{
    String name;
    int value;

    public Flovers(String name, int value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flovers flovers = (Flovers) o;
        return value == flovers.value && Objects.equals(name, flovers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "Flovers{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(Flovers flovers) {
        if(this.value == flovers.value){
            return this.name.compareTo(flovers.name);
        }
        return this.value - flovers.value;
    }
}
