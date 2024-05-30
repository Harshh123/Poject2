import java.util.*;
public class Scloop
{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the number");
       System.out.println("a");
       int a= sc.nextInt();     
        
       for(int i=1;i<=a;i++)
       
       {
int fact=fact*i;
       }
       System.out.println("factorial is "+fact);

        
    }
}