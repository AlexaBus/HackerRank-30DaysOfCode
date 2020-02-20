import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> contactList = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contactList.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(contactList.containsKey(s)) {
                System.out.println(s + "=" + contactList.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();


    }
}
