package program;

import java.util.Arrays;
import java.util.Iterator;

public class Merge2arrays {
	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		int[]b= {45,50,60,20,30};
		int []c=new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			c[j+a.length]=b[j];
		}
		System.out.println(Arrays.toString(c));
		//Arrays.sort(c);
		for(int k=0;k<c.length-1;k++)
		{
			for(int l=0;l<c.length-1;l++)
			{
				if(c[l]>c[l+1]) {
					int temp=c[l];
					c[l]=c[l+1];
					c[l+1]=temp;		
				}
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
