package justlearn;

import java.util.Scanner;

public class reverseno {
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		n=scan.nextInt();
		while(n>0)
		{
			System.out.print(n%10);
			n=n/10;
		}
		scan.close();
	}

}
