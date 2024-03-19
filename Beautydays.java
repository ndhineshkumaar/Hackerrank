import java.util.*;

public class Beautydays{
    public static void main(String args[]) {
        Scanner dk= new Scanner(System.in);
        int i= dk.nextInt();
        int j= dk.nextInt();
        int k= dk.nextInt();
        int count=0;
        for (int z=i;z<=j;z++){
            int reverse=0;
            int temp=z;
            while(temp>0){
                int remainder=temp%10;
                reverse=remainder*10+reverse;
                temp=temp/10;
            }
            if ((Math.abs(z-reverse))%k==0){
                count+=1;
            }
        }
        System.out.print(count);
    }
}
