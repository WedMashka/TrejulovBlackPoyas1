package lambda_expression.function;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test {
    static ArrayList<String[]> getArrayStudent(Scanner sc){
        ArrayList<String[]> listStudents = new ArrayList<>();
        while (sc.hasNext()){
            listStudents.add(sc.nextLine().split(" "));
        }
        return listStudents;
    }

    static ArrayList<Student> generateListStudents(Supplier<Student> supStudent,ArrayList<String[]> arString){
        ArrayList<Student> studentList = new ArrayList<>();
        for (int i = 0; i < arString.size(); i++) {
            studentList.add(supStudent.get());
            studentList.get(i).name =arString.get(i)[0];
            studentList.get(i).old =Integer.parseInt(arString.get(i)[1]);
            studentList.get(i).grade=Integer.parseInt(arString.get(i)[2]);
        }
        return studentList;
    }

    static void changeStudentList(ArrayList<Student> arListStud, Consumer<Student> consStud){
        for (int i = 0; i < arListStud.size(); i++) {
            consStud.accept(arListStud.get(i));
        }
    }

        static double averageOf(ArrayList<Student> listStudent, Function<Student, Double> funcStud){
        double res =0.0;
        for (Student stud:listStudent){
            res+=funcStud.apply(stud);
        }
        res = res/listStudent.size();
        return res;
        }

    public static void main(String[] args) throws FileNotFoundException {
        File fail = new File("E:\\students.txt");
        Scanner sc = new Scanner(fail);

        ArrayList<String[]> listArrayStringStudent = getArrayStudent(sc);
        ArrayList<Student> listStudent = generateListStudents(()->{
            return new Student("1",1,1);
        },listArrayStringStudent);

        System.out.println(listStudent);

        double res = averageOf(listStudent,(st)->{
            return (double) st.old;
        });
        System.out.println(res);
    }
}
