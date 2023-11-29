package program;

public class NewStringReverse {

	public static void main(String[] args) {
//		String word="reverse";
//		String reverse="";
//		char ch=0;
//		for(int i=0;i<word.length();i++) {
//		ch=word.charAt(i);
//		reverse=ch+reverse;
//		}
//		System.out.println(reverse);
	
	
//
//		String word="reverse   bhanu";		
//		String reverse="";
//		char ch[]=word.toCharArray();
//		for(int i=ch.length-1;i>=0;i--) {
//			System.out.print(ch[i]);
//		
//		String word="bhanu reddy";
//		String reverse="";
//		char ch=0;
//		for(int i=0;i<word.length();i++) {
//			ch=word.charAt(i);
//			reverse=ch+reverse;
//		}
//		System.out.println(reverse);
//		
		
		String word="bhanu";
		char ch[]=word.toCharArray();
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		
	}
}
