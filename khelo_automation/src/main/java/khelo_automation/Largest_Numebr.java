package khelo_automation;

import java.util.Scanner;

public class Largest_Numebr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		
		int [] a= {8,10,21,34,70,92};
		int max= a[0];
		for(int i=1; i<=a.length-1; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		if(n==max) {
			System.out.println("yes it is maximum number");
		}
		else {
			System.out.println(" no element is found ");
		}
	}

}
