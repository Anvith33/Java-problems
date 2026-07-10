package String;

public class lowertoupper {
    public static void main(String[] args) {
        String s="Anvith";
        String res="";
        for(int i=0;i<=s.length()-1;i++)
        {
            char c=s.charAt(i);
            if(c>='a' && c<='z')
            {
                res=res+(char)(c-32);
            }
            else
            {
                res=res+c;
            }
            
            }
            System.out.println(res);
            
        }

    }
    

