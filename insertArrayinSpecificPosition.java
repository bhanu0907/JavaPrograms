package program;

import java.util.Arrays;


public class insertArrayinSpecificPosition {
	public static void main(String[] args) {

		int a[]= {10,20,20,40};
		int []b= {1,2,3};
		int c[]=new int[a.length+b.length];
		int index=2;
		int newIndex=index;
		for (int i =0; i < b.length; i++) {
			c[index]=b[i];
			index++;
		}
		for(int i=0;i<a.length;i++) {
			if(i<newIndex) {
				c[i]=a[i];
			}
			else {
			c[i+newIndex+1]=a[i];
			}
		}
		System.out.println(Arrays.toString(c));}}
