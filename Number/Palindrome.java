

public class Palindrome {
public static void main(String[] args) {
	String original="hello";
	String reverse="";
	
	for(int i=original.length()-1;i>=0;i--) {
		reverse=reverse+original.charAt(i);
	}
	if(reverse.equals(original)) {
		System.out.println("palindrom");
	}else {
		System.out.println("not palindrome");
	}
}
}
