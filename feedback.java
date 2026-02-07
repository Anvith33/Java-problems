import java.util.Scanner;
public class feedback {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you need feedback? if you need type yes or else no");
        String str=scanner.nextLine();
        if(str.equals("yes")){
            System.out.println("ENTER YOUR FEEDBACK");
            String feedback=scanner.nextLine();
            System.out.println("YOUR FEEDBACK IS SUBMITTED SUCCESSFULLY");
            System.out.println("***THANK YOU***");
        }
        else{
            System.out.println("THANK YOU FOR YOUR RESPONSE");  
        }


    }
    
}
