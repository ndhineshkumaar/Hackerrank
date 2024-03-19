import java.util.*;

public class Repeatedstring{
    public static void main(String args[]) {
        Scanner dk= new Scanner(System.in);
        String s=dk.next();
        dk.nextLine();
        long n=dk.nextLong();
        long count=1;
        for (int i=1;i<s.length();i++){
            if (s.charAt(i)==s.charAt(0)) count++;
        }
        count=(n/s.length())*count;
        int temp=(int)n%s.length();
        for (int i=0;i<temp;i++){
            if (s.charAt(i)==s.charAt(0)) count++;
        }
        System.out.print(count);
    }
}
