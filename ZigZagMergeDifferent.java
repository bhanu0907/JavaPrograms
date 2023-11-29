package program;

import java.util.Arrays;

public class ZigZagMergeDifferent {

	public static void main(String[] args) {
		int []a= {10,20,30,98,87};
		int b[]= {40,50,60,44,55,66,77};
		int c[]=new int[a.length+b.length];
		int j=0; int i=0;
		
		while(i<a.length && i<b.length) {
//			c[k++]= a[i++];
//			c[k++]= b[j++];
			c[j]=a[i];
			j++;
			c[j]=b[i];
			i++;
			j++;
		}
	while(i<a.length)
	{
		c[j]=a[i];
		i++;
		j++;
	}
	while(i<b.length) {
		c[j]=b[i];
		i++;
		j++;
	}
		System.out.println(Arrays.toString(c));
	}

}
