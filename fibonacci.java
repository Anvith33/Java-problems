import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of fibonacci series:");
        int n=scanner.nextInt();
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<=n-3;i++)
        {
            int c=a+b;
            System.out.println(+c);
            a=b;
            b=c;
        }
    }
    
}


