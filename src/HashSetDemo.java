import java.util.HashSet;

public class HashSetDemo {
    private String Name;
    private Integer Age;
    public HashSetDemo(String Name,int Age){
        this.Name = Name;
        this.Age = Age;
    }
    @Override
    public String toString(){
        return "姓名："+Name+" "+"年龄："+Age;
    }

    @Override
    public int hashCode() {
        return Age.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        HashSetDemo hashSetDemo = (HashSetDemo) obj;

        if(hashSetDemo==this){return true;}
        if(hashSetDemo==null||getClass()!=hashSetDemo.getClass()){return false;}
        return Name.equals(hashSetDemo.Name);
    }

    public static void main(String[] args) {
        HashSet<HashSetDemo> set = new HashSet<>();
        set.add(new HashSetDemo("王",20));
        set.add(new HashSetDemo("王",20));

        set.forEach(hashSetDemo -> {System.out.println(hashSetDemo);});
    }
}
