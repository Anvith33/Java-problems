import java.util.Scanner;   
public class passwordsystem {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("CREATE YOUR PASSWORD");
        String cpassword=scanner.nextLine();
        System.out.println("ENTER THE PASSWORD");
        String password=scanner.nextLine();

        if(password.equals(cpassword))
            {
            System.out.println("ACCESS GRANTED");   
            }
        else
        {

            for(int i=0;i<5;i++)
            {
                System.out.println("WRONG PASSWORD. ACCESS DENIED TRY AGAIN");
                password=scanner.nextLine();
                if(password.equals(cpassword))
                {
                    System.out.println("ACCESS GRANTED");
                    break;
                }
            }
        }
    }
        
    }

        
    
    

