package program;

public class largestInArray {
	public static void main(String[] args) {
		int[] a= {10,20,-5,2,9};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-2;j++) {
				if(a[i]>a[j]) {
					max=a[i];
//				a[i]=a[j];
//					a[j]=max;

				}
			}
		//	System.out.println(max);
		}
		System.out.println(max);
	}}
