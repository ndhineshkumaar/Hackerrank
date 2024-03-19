import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class javasubstring {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        if (S.length()>=0 & S.length()<=100){
        if (start>=0 & end<=S.length()){
            System.out.println(S.substring(start,end));
}else{
    System.out.println("Poda");
}
}
    }
}
