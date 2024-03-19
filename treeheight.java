import java.util.*;

public class treeheight{
    public static void main(String args[]) {
        Scanner dk= new Scanner(System.in);
        int t= dk.nextInt();
        int[] n= new int[t];
        int height=1;
        for (int i=0;i<t;i++){
            n[i]=dk.nextInt();            
        }
        if (n[0]==0) System.out.println(height);
        for (int i=1;i<=n[t-1];i++){
            if (i%2!=0){
                height*=2;
            }
            else{
                height+=1;
            }
            for (int j=0;j<t;j++){
                if (n[j]==i){
                    System.out.println(height);
                }
            }
        }
    }
}
