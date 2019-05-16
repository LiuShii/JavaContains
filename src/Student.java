import java.awt.*;
import java.util.*;

public class Student implements Comparable{
    private int Sno;
    private String Name;
    private int Score;
    public Student(int Sno,String Name,int Score){
        this.Sno = Sno;
        this.Name = Name;
        this.Score = Score;

    }
    public int tiqu(Student student){
        char[] a = student.Name.toCharArray();
        int b = a[0];
        return b;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        Student student = (Student)o;

        return this.Score>student.Score?1:(this.Score==student.Score?(this.tiqu(student)>student.tiqu(student)?1:0):0);

    }
    public static void print(Set<Student> set){
        Iterator<Student> it = set.iterator();
        while (it.hasNext()){
            Student student = it.next();
            System.out.println(student.Sno+" "+student.Name+" "+student.Score);
        }
    }

    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        Student s1 = new Student(001,"Sam",100);
        Student s2 = new Student(002,"Ader",50);
        Student s3 = new Student(003,"Stever",66);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        print(set);
    }

}
