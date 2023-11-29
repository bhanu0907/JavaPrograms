package program;

import java.util.Arrays;

public class NewReverseArray {

	public static void main(String[] args) {
		int []num= {10,20,30,40};
		int []reverse=new int[num.length];
		for(int i=0;i<num.length;i++)
		{
			reverse[num.length-1-i]=num[i];
		}
		System.out.println(Arrays.toString(reverse));
	}

}
                       