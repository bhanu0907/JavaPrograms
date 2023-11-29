package program;

import java.util.Arrays;
import java.util.Iterator;

public class ZigZagAndMerge {

	public static void main(String[] args) {
		int []a= {10,20,30};
		int []b= {5,15,25};
		int []c=new int[a.length+b.length];
		int i=0;
		int j=0;
		while(i<a.length&&i<b.length)
		{
			c[j]=a[i];
			j++;
			c[j]=b[i];
		//	j++;
			i++;	
			j++;
		}
		
		System.out.println(Arrays.toString(c));
	}

}
