import java.util.*;

public class seqeq{
    public static void main(String args[]) {
        Scanner dk= new Scanner(System.in);
        int n= dk.nextInt();
        int[] arr=new int[n];
        int[] dup=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=dk.nextInt();
        }
        int temp=0;
        for (int i=1;i<=n;i++){
            for (int j=0;j<n;j++){
                if (arr[j]==i){
                    temp=j+1;
                    dup[i-0]=temp;
                }
            }
        }
        for (int i:dup){
            System.out.println(i);
            
        }
    }
}
