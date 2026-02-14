import java.util.Scanner;

public class program1 {

    public static void range(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = scanner.nextInt();

        System.out.print("Enter end number: ");
        int end = scanner.nextInt();

        range(start, end);

       
    }
}
