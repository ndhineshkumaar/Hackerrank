import java.util.*;

public class bday{
    public static void main(String args[]) {
        Scanner dk= new Scanner(System.in);
        int t=dk.nextInt();
        for (int i=0;i<t;i++){
            long b=dk.nextInt();
            long w=dk.nextInt();
            long bc=dk.nextInt();
            long wc=dk.nextInt();
            long z=dk.nextInt();
            long amnt=0;
            if (z>bc && z>wc) amnt=(b*bc)+(w*wc);
            else if (bc==wc) amnt=(b*bc)+(w*wc);
            else if (bc>wc && bc>z){
                long temp=b+w;
                amnt=temp*wc;
                amnt=amnt+(b*z);
            }
            else if (wc>bc && wc>z){
                long temp=b+w;
                amnt=temp*bc;
                amnt=amnt+(w*z);
            }
            
            System.out.println(amnt);
        }
    
    }
}
