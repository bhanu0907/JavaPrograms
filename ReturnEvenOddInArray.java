package program;

import java.util.Arrays;

public class ReturnEvenOddInArray {
	public static void main(String[] args) {
		int [] oddEven=evenOdd();
		System.out.println(Arrays.toString(oddEven));
		int a[]= {1,5,4,6,4,2};
	}
	public static int[] evenOdd() {

		int []a= {1,5,4,6,4,2};
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even++;
			}
			else
			{
				odd++;
			}
		}

		int count[]= {odd,even};
		return count;
	}}


