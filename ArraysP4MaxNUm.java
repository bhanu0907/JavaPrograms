package program;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysP4MaxNUm {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of the array");
	int size=sc.nextInt();
	int[] arrMax=new int[size];
	System.out.println("enter the values of the array");
	for(int i=0;i<arrMax.length;i++) {
		arrMax[i]=sc.nextInt();
	}
	System.out.println("input="+Arrays.toString(arrMax));
	int maxNumber=arrMax[0];
	int maxNumIndex=0;
	for(int i=0;i<arrMax.length;i++)
	//	for(int i=0;i<arrMax.length;i++) Smallest number
		
	{
		if(maxNumber<arrMax[i]) {
			maxNumber=arrMax[i];
			maxNumIndex=i;
			}
		
		}
		System.out.println(maxNumber);
		System.out.println(maxNumIndex);
	
}
}
