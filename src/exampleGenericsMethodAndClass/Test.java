package exampleGenericsMethodAndClass;

public class Test {
    public static void main(String[] args) {
        Schoolar ivan = new Schoolar("Ivan", 12);
        Schoolar roman = new Schoolar("Roman", 12);
        Schoolar alina = new Schoolar("Alina", 10);
        Schoolar sasha = new Schoolar("Alexander", 10);


        Student iona = new Student("Jonah", 23);
        Student yra = new Student("Yuriy", 27);
        Student mariya = new Student("Mariya", 23);
        Student vova = new Student("Vladimir", 25);


        Employeer pasha = new Employeer("Pasha", 25);
        Employeer ksuha = new Employeer("Kseniya", 29);
        Employeer marina = new Employeer("Marina", 22);
        Employeer lana = new Employeer("Svetlana", 24);


        Team<Schoolar> schoolTeam1 = new Team<>("hodunki");
        schoolTeam1.addParticepent(ivan);
        schoolTeam1.addParticepent(roman);
        Team<Schoolar> schoolTeam2 = new Team<>("toropuni");
        schoolTeam2.addParticepent(alina);
        schoolTeam2.addParticepent(sasha);



        Team<Student> studentTeam1 = new Team<>("drinkerSex");
        studentTeam1.addParticepent(iona);
        studentTeam1.addParticepent(yra);
        Team<Student> studentTeam2 = new Team<>("smokyEyse");
        studentTeam2.addParticepent(mariya);
        studentTeam2.addParticepent(vova);

        Team<Employeer> emploeeTeam1 = new Team<>("wild");
        emploeeTeam1.addParticepent(pasha);
        emploeeTeam1.addParticepent(ksuha);
        Team<Employeer> employeeTeam2 = new Team<>("alwaysready");
        employeeTeam2.addParticepent(marina);
        employeeTeam2.addParticepent(lana);

        schoolTeam1.game(schoolTeam2);
        studentTeam1.game(studentTeam2);
        emploeeTeam1.game(employeeTeam2);



    }
}
