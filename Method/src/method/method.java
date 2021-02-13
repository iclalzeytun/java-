package method;

import java.util.Scanner;

public class method {

	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		int x;
		System.out.println("enter x :");
		x=scan.nextInt();
		f(x);
		
		power(2,3); //üs alma fonksiyonu
		
	}

	static void f (int x) {  
		int result= (x+2)*6;
		System.out.println(result);
	}
	static void power(int mynum,int mynum2) {  
		int result =1;
		for (int i=1;i<=mynum2;i++) {
			result *= mynum;
		}
	System.out.println(result);
	}
	
}
