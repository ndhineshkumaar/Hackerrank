import java.util.*;

public class Valley {
    public static void main(String args[]) {
        Scanner dk = new Scanner(System.in);
        int n = dk.nextInt();
        dk.nextLine(); // Consume the newline character after reading n
        String path = dk.nextLine(); // Read the path as a string

        int height = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (path.charAt(i) == 'U') {
                height += 1;
            } else {
                height -= 1;
            }

            // Check if you've returned to sea level (height == 0) and if the current step is 'U'
            if (height == 0 && path.charAt(i) == 'U') {
                count++;
            }
        }

        System.out.print(count);
    }
}
