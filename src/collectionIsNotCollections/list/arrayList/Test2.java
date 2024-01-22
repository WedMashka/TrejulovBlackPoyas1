package collectionIsNotCollections.list.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {
        List<Food> cart = new ArrayList<>();
        cart.add(new Food("meat", 400));
        cart.add(new Food("chocolate", 420));
        cart.add(new Food("apple", 120));
        cart.add(new Food("peach", 180));
        System.out.println(cart);
        Food redApply = new Food("apple", 120);
        Food greenApply = new Food("apple", 130);

        System.out.println(cart.indexOf(redApply));
        System.out.println(cart.indexOf(greenApply));
        System.out.println(cart.contains(redApply));
        System.out.println(cart.contains(greenApply));

        List<Food> cart2 = new ArrayList<>();
        cart2.add(new Food("apple", 120));
        cart2.add(new Food("peach", 180));
        cart2.add(new Food("kivy", 110));
        cart2.add(new Food("cherry", 210));

        System.out.println("cart " +cart);
        System.out.println("cart2 " +cart2);
//        cart.removeAll(cart2);
        cart.retainAll(cart2);
        System.out.println("cart " +cart);

    }
}



class Food {
    private String name;
    private int calory;

    public Food(String name, int calory) {
        this.name = name;
        this.calory = calory;
    }

    public String getName() {
        return name;
    }

    public int getCalory() {
        return calory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return calory == food.calory && Objects.equals(name, food.name);
    }

    @Override
    public String toString() {
        return "{"+
                "name='" + name + '\'' +
                ", calory=" + calory +
                '}'+ "\n";
    }
}

