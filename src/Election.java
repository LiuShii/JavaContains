import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Election {
    private String Candidate[];
    private String cand1=null;
    private String cand2=null;


    public Election(String[] Candidate) {
        this.Candidate = Candidate;

    }

    public String  Sysin(){
        Scanner scanner = new Scanner(System.in);
        String s= scanner.next();
        return s;
    }
    public String[] Spilt(String str){
        String[] strings = str.split(" ");
        return strings;
    }

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String[] strings = {"Tom","Batman","Jerry"};
        Election e=new Election(strings);

        int[] getv=new int[2];
        String[] cand;
        for(int People = 0;People<=10;People++){
            cand=e.Spilt(e.Sysin());
            for(int i=0;i<=3;i++){
                if(cand[i].equals("Tom")){
                    getv[0]++;
                }
                if(cand[i].equals("Batman")){
                    getv[1]++;
                }
                if(cand[i].equals("Jerry")){
                    getv[2]++;
                }

            }

        }
        map.put("Tom",getv[0]);
        map.put("Batman",getv[1]);
        map.put("Jerry",getv[2]);


        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry<String,Integer>)it.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
