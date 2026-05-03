package khelo_automation;

import java.util.Scanner;

public class Find_arrey {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		int [] a= {8,10,21,34,70,92};
		boolean found=true;
		for(int i= 1; i<a.length; i++) {
			if(a[i]==n) {
				System.out.println(" yes it present at  : "+ i);
				found=false;
				break;
			}
			
		}
		if(!found) {
			System.out.println("this element is not present in the arry ");
		}
		
	}

}
