package bacsic.dev;
import java.util.Scanner;
public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("nhap vao n:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 0;
		int tong = 0;
		
		while (i<n)	{
			i++;
			
		if (i % 3 == 0)	{
			tong += i ;
		
		}
		
		}
		System.out.println("\ntong = " + tong );
	}

}
