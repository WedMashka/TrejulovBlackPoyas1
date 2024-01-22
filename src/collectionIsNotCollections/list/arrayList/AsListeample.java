package collectionIsNotCollections.list.arrayList;

import java.util.Arrays;
import java.util.List;

public class AsListeample {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("A");
        StringBuilder b = new StringBuilder("B");
        StringBuilder c = new StringBuilder("C");
        StringBuilder d = new StringBuilder("D");
        StringBuilder e = new StringBuilder("E");
        StringBuilder[] arrABC = {a,b,c,d,e};
        List<StringBuilder> listABC = Arrays.asList(arrABC);
        System.out.println("listABC "+listABC);
        arrABC[0] = new StringBuilder("A!!!");
        System.out.println("listABC "+listABC);
//        listABC.add(new StringBuilder("F")); НЕ БУДЕТ РАБОТАТЬ Т.К. ЛИСТ ОБРАЗОВАННЫЙ ПРИ ПОМОЩТ ARRAYS ДОБАВИТЬ НОВЫЙ ЭЛЛЕМТ НЕЛЬЗЯ



    }
}
