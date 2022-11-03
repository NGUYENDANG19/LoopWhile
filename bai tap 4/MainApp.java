package basic.dev;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		    
		    int num1,num2, reversed = 0;
		    System.out.println("\n\nNhập vào số cần đảo ngược: ");
		    num1 = sc.nextInt();
		  
		    num2 = num1;
		   
		   while(num1 != 0) {
		      int digit = num1 % 10;
		      reversed = reversed * 10 + digit;
		      num1 /= 10;
		      
			  }
		  
		   if(num2==reversed)	{
			  System.out.println("la so Polinom");
		  }else	{
			  System.out.println("ko phai so Polinom");
		  }
		  
		 
		  
	}

}
