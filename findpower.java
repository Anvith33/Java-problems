import java.util.Scanner;
public class findpower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base number:");
        int base = scanner.nextInt();
        System.out.println("Enter the exponent:");
        int exponent = scanner.nextInt();
        for(int i=base;i<=exponent;i++){
            int result = (int) Math.pow(base, i);
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }


    
}
}
