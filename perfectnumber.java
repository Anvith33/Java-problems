
public class perfectnumber
{
    public static void main(String[] args)
    {
        int num=6,sum=0;
        int original=num;
        for(int i=1; i<num; i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(sum==original)
        {
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
    
}
