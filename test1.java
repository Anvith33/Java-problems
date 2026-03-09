//non repeated character in a string
import java.util.Scanner;
public class test
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int firstIndex=s.indexOf(c);
            int lastIndex=s.lastIndexOf(c);
            if(firstIndex==lastIndex){
                System.out.println("The  non-repeated character are: "+c);
            
            
            }
           
    }
}
}
    
       
   