package program;

import java.util.Arrays;

public class AvgOfArray {
	public static void main(String[] args) {
		int a[]= {2,5,3,9,6};
		
		int sum=0;
		int avg=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println(Arrays.toString(a));
		System.out.println(avg);
	}


//	public static void main(String[] args) {
//String name="bhanu";
//int size=name.length();
////char []ch=name.toCharArray();
//for(int i=0;i<name.length();i++) {
//	char ch=name.charAt(i);
//	if(ch>=65 && ch<90) {
//	ch=(char) (ch+32);
//	System.out.print(ch);
//	}

		
	}

