package exampleGenericsMethodAndClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Partithepent> {
    private String name;
    private List<T> team = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticepent(T p){
        team.add(p);
    }

    public void game(Team<T> t){
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0){
            System.out.println("Win team " + this.name );
        }else if (i ==1){
            System.out.println("Win team " + t.name );;
        }else {
            System.out.println("Something went wrong!!!!");
        }
    }

}
