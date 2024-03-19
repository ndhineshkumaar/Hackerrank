import java.util.*;

public class maxheight{
    public static void main(String args[]) {
        Scanner dk= new Scanner(System.in);
        int[] h = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String a=dk.nextLine();
        int maxheight=0;
        for (int i=0;i<a.length();i++){
            char c=a.charAt(i);
            int index=c-'a';
            if (index>=0&&index<h.length){
            maxheight=Math.max(h[index],maxheight);
            }
        }
    System.out.print(maxheight);
    }
}
