import java.util.Scanner;
public class primenumber1 {
    public static void primeNumbers(int start, int end)
    {
        for (int i = start; i <= end; i++) {
            if(isPrime(i))
            {
                
                System.out.println(i);
              }      }   
    }
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter end number: ");
        int end = scanner.nextInt();
        primeNumbers(start, end);
    }
}
