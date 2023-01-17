import java.util.Scanner;

public class no_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            int price = sc.nextInt();
            int pCount = sc.nextInt();

            total = total - (price * pCount);
        }
        if (total == 0) {
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}
