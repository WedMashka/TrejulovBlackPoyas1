package lambda_expression.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    static void selectTree(List<Tree> listTree, Predicate<Tree> p){
        for (Tree tree: listTree){
            if(p.test(tree)){
                System.out.print(tree);
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Tree oak = new Tree("Oak", 15);
        Tree pine = new Tree("Pine", 60);
        Tree birch = new Tree("Birch", 8);
        Tree poplar = new Tree("Poplar", 40);
        List<Tree> listTree = new ArrayList<>();
        listTree.add(oak);
        listTree.add(pine);
        listTree.add(poplar);
        listTree.add(birch);
        System.out.println(listTree);
        selectTree(listTree,(p)-> p.height>20);

    }

}
