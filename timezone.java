import java.util.*;
public class timezone{
    public static void main(String args[]){
        Scanner dk=new Scanner(System.in);
        String s=dk.nextLine();
        String str="";
        if (!s.substring(0,2).equals("12")&&s.contains("PM")){
            str=Integer.toString(Integer.parseInt(s.substring(0,2))+12);
            s=str+s.substring(2,(s.length()-2));
        }
        if (s.substring(0,2).equals("12")&&s.contains("AM")){
            str="00";
            s=str+s.substring(2,(s.length()-2));
        }
        else if ((!s.substring(0,2).equals("12")&&s.contains("AM"))){
            s=s.substring(0,(s.length()-2));
        }
    System.out.println(s);
    }
}