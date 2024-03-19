import java.util.Scanner;
public class ksum{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        String s= scan.nextLine();
        int k= scan.nextInt();
        int Aschii=0;
        for (int i=0;i<s.length();i++){
            int temp=((s.charAt(i)-97)+k)%26;
            System.out.print((char)(temp+97));

        }

    }
}