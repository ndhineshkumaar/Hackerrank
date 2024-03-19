import java.util.*;
public class dayofprogram{
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        int year=dk.nextInt();
        String s=".09."+Integer.toString(year);
        if (year==1918){
            System.out.println(26+s);
        }
        if ((year<=1917&&year%4==0)||(year>1918&&(year%400==0||(year%4==0&&year%100!=0)))){
            System.out.println(12+s);
        }
        else{
            System.out.println(13+s);
        }
    }
}