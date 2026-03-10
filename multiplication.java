import java.util.Scanner;
public class multiplication 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scanner.nextInt();
        for(int i=1;i<=10;i++)
        {
             int result=n*i;
            System.out.println(n+" x "+i+" = "+result);
        }
    }
    
}
