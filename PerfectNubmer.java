package program;

public class PerfectNubmer {

	public static void main(String[] args) {
		int a=28;
		int sum=0;
		int num=a;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
			a=a/10;
		}
		System.out.println(num);
		System.out.println(sum);
		if(num==sum) {
			System.out.println("perect number");
		}
		else{
			System.out.println("not a perect number");			
		}
			
			
	
	}

}
