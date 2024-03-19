import java.util.Scanner;
public class blockdeclare {
    public static void main (String args[]){
    Scanner scan= new Scanner(System.in);
    int b= scan.nextInt();
    int h= scan.nextInt();
    
    try {
        if (b>0 & h>0){
            int area= b*h;
            System.out.println(area);
        }
        else{
            throw new Exception("Breadth and height must be positive");
        }
    } catch (Exception e) {
         System.out.println(e);
    }
    scan.close();
        
}
}
