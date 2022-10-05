package calculator;
import java.util.Scanner;

public class Calculator1 {


		public static void main(String[] args)
		 {
			 Scanner sc=new Scanner(System.in);
			 Operation op=new Operation();
			  boolean b=true;
			  while(b)
			  {       
			      System.out.println("----------------------------------");
				    System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division\n5.Sin\n6.Cos\n7.Tan\n8.Log\n9.SquareRoot\n10.CubeRoot\n11.Factorial\n12.Exit");
				  System.out.println("----------------------------------");
				  System.out.println("Enter the choice");
				  int choice=sc.nextInt();
				  switch(choice)
				  {
					  case 1:
					  {
						  op.addition();
						  break;
					  }
					   case 2:
					  {
						   op.subraction();
						  break;
					  }
					   case 3:
					  {
						   op.multiplication();
						  break;
					  }
					   case 4:
					  {
						  op.division();
						  break;
					  }
					   case 5:
					  {
						  op.sin();
						  break;
					  }
					   case 6:
					  {
						  op.cos();
						  break;
					  }
					   case 7:
					  {
						  op.tan();
						  break;
					  }
					   case 8:
					  {
						  op.log();
						  break;
					  }
					   case 9:
					  {
						  op.squareRoot();
						  break;
					  }
					   case 10:
					  {
						  op.CubeRoot();
						  break;
					  }
					  case 11:
					  {
						op.factorial();
						break;
					  }
					  case 12:
					  {
					   b=false;
					   System.out.println("Thankyou for using calculator");
						  break;
					  }
					  default:
					  {
						 System.out.println("Please Enter Correct Choice...!");
						 break;
					  }
					  
				  }
				  
			  }
		   }

		}
