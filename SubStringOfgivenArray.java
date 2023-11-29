package program;

public class SubStringOfgivenArray {
public static void main(String[] args) {
	String subString="abbc";
	//char ch[]=subString.toCharArray();
	//int count=1;
	for(int i=subString.length();i<subString.length();i++) {
	for (int j = 0; j < args.length; j++) {		
		System.out.println(subString.substring(i));
	}
		
	//	System.out.println(subString.substring(i));
	//	count++;
	}
}
}
//if (i == 0 && endIndex == length)