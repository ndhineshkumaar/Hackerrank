import java.util.Scanner;
public class array1{
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        String S= scan.nextLine();
        int [] arr = new int[26];
        for (int i=0;i<S.length();i++){
            int temp=((S.charAt(i)-97));
            arr[temp]+=1;                    
        }
        for (int j=0;j<S.length();j++){
            int aschii=(int)(S.charAt(j)-97);
            if (arr[aschii] > 0) {
                System.out.println(S.charAt(j) + "----" + arr[aschii]);
                arr[aschii]=0;
            }
        }
        }
                        
}