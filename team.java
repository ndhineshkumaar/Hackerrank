import java.util.*;

public class team{
    public static void main(String args[]) {
        Scanner dk = new Scanner(System.in);
        int n = dk.nextInt(); 
        int m= dk.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = dk.nextInt();
            }
            
        }
        System.out.print("okk");

    }
}

