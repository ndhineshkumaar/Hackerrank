import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    static Arrays isAnagram(String a, String b) {
        // Complete the function
        if (a.length()!=b.length()){
        }
        char[] array1= a.toLowerCase().toCharArray();
        char[] array2= b.toLowerCase().toCharArray();
        r(array1 + "   " +array2);
            }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        isAnagram(a, b);
    }
}
