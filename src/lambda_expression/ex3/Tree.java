package lambda_expression.ex3;

import java.util.Objects;

public class Tree {

    String name;
    int height;


    public Tree(String name, int height) {
        this.name = name;
        this.height = height;

    }

    @Override
    public String toString() {
        return  " {" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return height == tree.height && Objects.equals(name, tree.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }
}
