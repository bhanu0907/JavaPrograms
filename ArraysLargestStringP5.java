package program;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysLargestStringP5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		String [] arrString=new String[size];
		System.out.println("enter the values of the array");
		for(int i=0;i<size;i++) {
			
			arrString[i]=sc.next();
		}
		System.out.println(Arrays.toString(arrString));
		String largestString=arrString[0];
		int indexLargeString=0;
		for(int i=0;i<arrString.length;i++) {
			
			if (largestString.length()<arrString[i].length()) {
			largestString=arrString[i];
			indexLargeString=i;
			}}
			System.out.println("Largest string="+largestString);
			System.out.println("Index of largest string is="+indexLargeString);
			
			
		}
		
			
			
			
			
		
		

	}



