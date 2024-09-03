package Samples;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int i=2,flag=0;
		while(i<n/2) {
			if(n%i==0) {
				flag=1;
				break;
			}
			i++;
		}
		if(flag==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Composite Number");
		}
		sc.close();
	}

}
