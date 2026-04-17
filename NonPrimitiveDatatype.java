import java.io.IOException;
import java.util.Scanner;
public class NonPrimitiveDatatype {
    public static void main(String[] args) throws Exception {
        try {
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter your name");
            String name = obj.nextLine();
            System.out.println("Enter the number of your favourite items");
            int n = obj.nextInt();
            System.out.println("Enter your Favourite Items");
            String[] nums = new String[n];
            for (int i = 0; i <= n; i++) {
                nums[i] = obj.nextLine();
            }
            for (int i = 0; i < n; i++) {
                System.out.println("your favorite items are"+nums[i]);
            }
        }

        catch (Exception Exception)
        {
            System.out.println("EXCEPTION FOUND");
        }

    }
}
