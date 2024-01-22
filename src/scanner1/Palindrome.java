package scanner1;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int a, i=0 ,j=0;
		a=n;
		
		while (a>0) {
			i = a%10;
			i = (j*10)+i;
			a = a/10;
			
			if (n==j) {
				System.out.println("It is palindrome");
			}
				
			else {
				System.out.println("It is not palindrome");
			}

			}
	}
}
	
	

		

