package program;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class PrimeInTheArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int[] primeArr=new int[size];
		System.out.println("enter the values of the array");
	for (int i = 0; i < primeArr.length; i++) {
		primeArr[i]=sc.nextInt();		
	}
	System.out.println("input="+Arrays.toString(primeArr));
	int primeCount=0;
	int dividers=0;
	for(int i=1;i<primeArr.length;i++) {
	//	if(primeArr[i]!=1&&primeArr[i]!=2) {
			//for (int j = 1; j < primeArr.length; j++) {	
			if(primeArr[i]%primeArr[i]==0&& primeArr[i]%i!=0)
			{
			dividers++;
			primeCount++;
			
			}
		//}
	}
	
		

	System.out.println(primeCount);
	System.out.println(dividers);
if (dividers>2 && dividers!=0) {
	System.out.println("number of prime numbers in the array are="+primeCount);

	
	}

}}
