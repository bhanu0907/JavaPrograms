package program;

import java.util.Arrays;

public class practice2 {

	public static void main(String[] args) {
		//String []prefix= {"javaking","javaprince","javamava","javabava"};
		//		String []prefix= {"bhanu","reddy","prakash"};
		//		int size=prefix.length;
		//	//	int end=Math.min(prefix[0].length(), prefix[size-1].length());
		//		int i=0;
		//		while(i<size && prefix[0].charAt(i)==prefix[size-1].charAt(i))
		//		{
		//
		//			i++;
		//		}
		//		String result=prefix[0].substring(0, i);
		//		if(!result.isEmpty()) {
		//		System.out.println(prefix[0].substring(0, i));
		//		}
		//		else {
		//			System.out.println(-1);
		String []prefix= {"javaking","javaprince","javamava","javabava"};
	//	String []prefix= {"bhanu","reddy","prakash"};
		System.out.println(largestPrifixofArray(prefix));
	}

	public static String largestPrifixofArray(String[] prefix) {
		int size=prefix.length;
		Arrays.sort(prefix);
		int i=0;
		while(i<size && prefix[0].charAt(i)==prefix[size-1].charAt(i)) {
			i++;
		}
		String result=prefix[0].substring(0,i);
		if(!result.isEmpty())
		{
return result;
		}
		else {
			return "-1";
		}
		
	}


}


