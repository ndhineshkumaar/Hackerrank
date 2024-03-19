import java.util.*;
public class verybig{
    public static void main(String args[]){
        Scanner dk = new Scanner(System.in);
        int n=dk.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=dk.nextInt();
        }
        int sum = 0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            System.out.println(sum);
        }
        /*for (int i : arr){
            System.out.println(i);
            sum+=i;
            System.out.println(sum);
        }*/
    }
}