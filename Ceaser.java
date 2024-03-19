import java.util.*;

public class Ceaser{
    public static void main(String args[]) {
        Scanner dk= new Scanner(System.in);
        int n=dk.nextInt();
        String s=dk.next();
        int k=dk.nextInt();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>='a' && s.charAt(i)<='z' ){
                int aschi=s.charAt(i)-96;
                int add=aschi+k;
                int found=add%26;
                System.out.print((char)(found+96));
            }
           else if (s.charAt(i)>='A' && s.charAt(i)<='Z' ){
                int aschi=s.charAt(i)-64;
                int add=aschi+k;
                int found=add%26;
                System.out.print((char)(found+64)); 
            }
            else {
                System.out.print(s.charAt(i));
            }
           }
        }
    }
