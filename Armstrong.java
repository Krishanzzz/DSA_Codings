package Samples;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int tot=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt(); 
		int temp = n;
		int len = String.valueOf(temp).length();
		while(n!=0) {
			int digit = n%10;
			tot += (int)Math.pow(digit,len);
			n/=10;
		}
		if(temp == tot) {
			System.out.println("This "+temp+" is armstrong number");
		}else {
			System.out.println("This "+temp+" is not armstrong number");
		}
		sc.close();
	}

}
