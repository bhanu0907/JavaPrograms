package program;

import java.util.Arrays;

public class SortAndMergeTheArray {

	public static void main(String[] args) {
		int[]a= {10,50,5,8};
		int[]b= {8,2,10,2};
		int[]c=new int[a.length+b.length];
		int i=0; int j=0; int k=0;
		while(i<a.length+b.length) {
			if(a[i]<b[j])
			{
			c[k]=a[i];
			i++;
			}
			else {
			c[k]=b[j];
			j++;
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
