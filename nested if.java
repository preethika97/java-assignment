import java.util.Scanner;
public class Main
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age: ");
        int age=sc.nextInt();
        if( age< 100 )
        { 
           System.out.println("age is less than 100"); 
           if(age > 50)
           {
	          System.out.println("age is greater than 50");
	       }
	    }
	    else
	    {
	        System.out.println("age is equal to 100");
	    }
     }
}