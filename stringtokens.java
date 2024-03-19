import java.io.*;
import java.util.*;

public class stringtokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        String[] h= s.split("[ !,?._@']+");
        System.out.println(h.length);
        for (String H:h){
            System.out.println(H);
        }
        scan.close();
    }
}