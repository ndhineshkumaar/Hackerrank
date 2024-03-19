import java.util.*;

public class Libfine{
    public static void main(String args[]) {
        Scanner dk= new Scanner(System.in);
        int d1=dk.nextInt();
        int m1=dk.nextInt();
        int y1=dk.nextInt();
        int d2=dk.nextInt();
        int m2=dk.nextInt();
        int y2=dk.nextInt();
        if(d1==d2||d1<d2&&m1==m2||m1<m2&&y1==y2||y1<y2){
            System.out.println(0);
        }
        else if(d1>d2&&m1==m2&&y1==y2){
            System.out.println(15*(d1-d2));
        }
        else if(m1>m2&&y1==y2){
            System.out.println(500*(m1-m2));
        }
        else if(y1>y2){
            System.out.println(1000);
        }
    }
}
