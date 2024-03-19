import java.util.*;
public class kangaroo1{
    public static void main(String args[]){
        Scanner dk= new Scanner (System.in);
        int x1=dk.nextInt();
        int v1=dk.nextInt();
        int x2=dk.nextInt();
        int v2=dk.nextInt();
        
        if (v1<v2){
            System.out.println("NO");
        }
        else if ((x2-x1)%(v1-v2)==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}