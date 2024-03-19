import java.util.*;

public class choco{
    public static void main(String args[]) {
        Scanner dk= new Scanner(System.in);
        int t=dk.nextInt();
        for (int i=0;i<t;i++){
            int n=dk.nextInt();
            int c=dk.nextInt();
            int m=dk.nextInt();
            int count=n/c;
            int wrapper=n/c;
            while(wrapper>=m){
                wrapper=wrapper/m;
                count+=wrapper;
            }System.out.print(count);
        }
        
    }
}
