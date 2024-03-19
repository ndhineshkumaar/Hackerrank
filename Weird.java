import java.util.Scanner;
public class Weird{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        if (n>=1 && n<=100){
            if (n%2==0){
                if (n>=2 && n<=5){
                    System.out.println("Not Weird");
                }
                else if (n>=6 && n<=20){
                    System.out.println("Weird");
                }
                else{
                    System.out.println("Not Weird");
                }
            
        }
            else{
                System.out.println("Weird");
            }
    }
}
}