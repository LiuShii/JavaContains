
import java.util.*;

public class MyArrayList implements Comparable {
    private long Sno;
    private String Name;
    private int zongce;
    public MyArrayList(long Sno , String Name , int zongce){
        this.Sno = Sno;
        this.Name = Name;
        this.zongce = zongce;
    }

    public int getZongce() {
        return zongce;
    }

    public long getSno() {
        return Sno;
    }

    public String getName() {
        return Name;
    }

    @Override
    public int compareTo(Object o) {
        MyArrayList student = (MyArrayList)o;
        int result = this.zongce>student.zongce?1:(this.zongce == student.zongce?0:-1);
        if(result == 0){
            result = this.Sno >student.Sno?1:-1;
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<MyArrayList> list = new ArrayList<>();
        list.add(new MyArrayList(3153,"wang",120));
        list.add(new MyArrayList(3154,"li",90));
        list.add(new MyArrayList(3152,"chen",120));
        list.add(new MyArrayList(3156,"liu",70));
        Collections.sort(list,Comparator.reverseOrder());
        Iterator<MyArrayList> iter =list.iterator();
//        MyArrayList myArrayList;
//        while(iter.hasNext()){
//           myArrayList = iter.next();
//           System.out.println(myArrayList.getSno()+" "+myArrayList.getName()+" "+myArrayList.getZongce());
//           iter.forEachRemaining();
//        }
        iter.forEachRemaining(MyArrayList->System.out.println(MyArrayList.getSno()+" "+MyArrayList.getName()+" "+MyArrayList.getZongce()));

    }
}
