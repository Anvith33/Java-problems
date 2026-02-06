import java.util.Scanner;
public class reversestring {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
        if(str.equals(new StringBuilder(str).reverse().toString())){
            System.out.println("Strings are equal and its a palindrome");
        }
        else{
            System.out.println("Strings are not equal and not a");
        }
    }
}