package program;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
//		String [] arr= {"bhanu","prakash","reddy"};
//		String[] reverseArray=new String[arr.length];
//		for(int i=0;i<arr.length;i++)
//		{
//			reverseArray[arr.length-1-i]=arr[i];
//		}
//		System.out.println(Arrays.toString(reverseArray));
		String []num= {"bhanu","prakash","reddy"};
		String [] reverse=new String[num.length];
		for(int i=0;i<num.length;i++)
				{
			reverse[num.length-1-i]=num[i];
		}
		System.out.println(Arrays.toString(reverse));
		
		
	}

}
