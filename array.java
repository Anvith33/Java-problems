public class array {
    public static void main(String[] args){
        int [] a=new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        // for(int i=0;i<a.length;i++)
        for(int i:a)// for each loop
        {
            System.out.println(i);
        }
       
    }
    
}
