import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Election {
    private String Candidate[];



    public Election(String[] Candidate) {
        this.Candidate = Candidate;

    }

    public String[]  Sysin(){
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        return s;
    }
//    public String[] Spilt(String str){
//        String[] strings = str.split(" ");
//        return strings;
//    }

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        System.out.print("Please put Candidates(only three candidate):");
        Scanner sc =new Scanner(System.in);
        String[] Candidates = sc.nextLine().split(" ");
        while(Candidates.length!=3){
            System.out.println("put worry!put again!");
            Scanner sc1 =new Scanner(System.in);
            Candidates = sc1.nextLine().split(" ");
            if(Candidates.length==3){
                break;
            }
        }
        Election e=new Election(Candidates);


        System.out.println("Please vote to Candidates with two from them!");

        int[] getv=new int[3];
        String[] cand;
        for(int People = 0;People<10;People++){
            cand=e.Sysin().clone();

            for(int i=0;i<=1;i++){
                if(cand[i].equals(Candidates[0])){
                    getv[0]++;
                }
                if(cand[i].equals(Candidates[1])){
                    getv[1]++;
                }
                if(cand[i].equals(Candidates[2])){
                    getv[2]++;
                }

            }

        }
        map.put(Candidates[0],getv[0]);
        map.put(Candidates[1],getv[1]);
        map.put(Candidates[2],getv[2]);


        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry = (Map.Entry<String,Integer>)it.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
