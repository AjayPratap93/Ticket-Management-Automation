package khelo_automation;

public class Arreynew {
	
	public static void main(String[] args) {
		String number ="121";
		String rev="";
		for(int i =number.length()-1; i>=0; i--) {
		rev=rev+number.charAt(i);
		}
		//System.out.println(rev);
		if(number.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println(" not Palindrome");
		}
		
	}

}
