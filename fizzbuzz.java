public class fizzbuzz {
    public static void main(String[] args)
{
    int num=15;
    String[] result=new String[num];
for(int i=1;i<=num;i++)
{
    if(i%3==0 && i%5==0)
    {
        result[i - 1]="fizzbuzz";
    }
    else if(i%3==0)
    {
        result[i - 1]="fizz";
    }
    else if(i%5==0)
    {
        result[i - 1]="buzz";
    }
    else{
        result[i - 1]=String.valueOf(i);
    }

}
}
    
}
