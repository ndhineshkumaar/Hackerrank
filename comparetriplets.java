import java.util.*;
public class comparetriplets{
    public static void main (String args[]){
        Scanner dk = new Scanner(System.in);
        int[] a= new int[3],b= new int[3],r= new int[2];;
        r[0]=0;
        r[1]=0;
        
        for (int i=0;i<3;i++){
            a[i]=dk.nextInt();            
        }
        for (int i=0;i<3;i++){
            b[i]=dk.nextInt();            
        }
        for (int i=0;i<3;i++){
            if (a[i]>b[i]){
                r[0]+=1;
            }   
            else if (b[i]>a[i]){
                r[1]+=1;
            }  
            else if (a[0]==b[0]){
                r[0]+=0;
                r[1]+=0;
            }  
        }
        
        for (int i :r ){
            System.out.print(i + " ");
        }
        
        
    }
}