package program;
import java.util.Scanner;
public class EvenInArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the Array");
		int size=sc.nextInt();
		int [] a=new int[size];
		int even=0;
		System.out.println("Enter the values");
		for(int i=0;i>a.length;i++) {
			a[i]=sc.nextInt();
			if(a[i]%2==0) {
				even=a[i];		
				System.out.println(even);
			}
//			System.out.println("even numbers are");
//			System.out.println(even);

		}
	//	System.out.println("even numbers are");
		//System.out.println(even);
		

	}
}
