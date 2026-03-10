import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        int n1, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        while(number > 0)
        {
            n1=number%10;
            sum=sum+n1;
            number=number/10;
        }
        System.out.println("Sum of digits is:"+sum);
    
}
}
