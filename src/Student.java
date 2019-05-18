import java.awt.*;
import java.util.*;

public class Student implements Comparable {
    private int Sno;
    private String Name;
    private int Score;

    public Student(int Sno, String Name, int Score) {
        this.Sno = Sno;
        this.Name = Name;
        this.Score = Score;

    }



    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        int result = this.Score>student.Score?1:(this.Score == student.Score?0:-1);
        if(result==0){
            result = this.Name.compareTo(student.Name);
        }
        return result;


    }


    public static void print(Set<Student> set) {
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student student = it.next();
            System.out.println(student.Sno + " " + student.Name + " " + student.Score);
        }
    }

    public static void main(String[] args) {
        Set<Student> set = new TreeSet<Student>();
        set.add(new Student(4, "Szms", 100));
        set.add(new Student(1, "Ss", 100));
        set.add(new Student(2, "Ader", 50));
        set.add(new Student(3, "Stever", 66));

        print(set);
    }


}