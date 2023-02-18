import java.util.*;
class Assignment2
{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers");
        int i,a,sum=0;
        for(i=0;i<5;i++)
        {
            a=s.nextInt();
            sum=sum+a;
        }
        System.out.println("Sum of numbers"+sum);
    }
}
