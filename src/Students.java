import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Students {
    private String Name;
    private int Age;
    public Students(String Name,int Age){
        this.Age = Age;
        this.Name = Name;

    }

    @Override
    public boolean equals(Object obj) {
        Students students = (Students) obj;

        if(this.Name.equals(students.Name)&&this.Age==students.Age){
            return true;
        }
        else return false;
    }

    @Override
    public int hashCode() {
        int result;
        result = (Name==null?0:Name.hashCode());
        return result;
    }

    public static void main(String[] args) {
        Map<Students ,String> map = new HashMap() ;
        map.put(new Students("wang",18),"HongKong");
        map.put(new Students("liu",18),"HongKong");
        map.put(new Students("wang",18),"American");
        map.put(new Students("wang",21),"zhongguo");

        for(Students students : map.keySet()){

            System.out.println(students.Name+" "+students.Age);

        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){

            Map.Entry<Students,String> entry = (Map.Entry<Students,String>)it.next();
            System.out.println(entry.getKey().Name+" "+entry.getKey().Age+" "+entry.getValue());
        }


    }
}
