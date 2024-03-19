import java.util.Scanner;
public class stdinout{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    double m=scan.nextDouble();
    scan.nextLine();
    String o=scan.nextLine();

    System.out.println("String: " + o);
    System.out.println("Double: " + m);
    System.out.println("Int: " + n);

}
}