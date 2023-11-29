package program;

public class StrongNu {

	public static void main(String[] args) {
		int num=145;
		int fact=1;
		int orginal=num;
		int sumFact=0;
	//	for(int i=0;num>0;i++) {
	
			while(num>0) {
				int rem=num%10;
		//0		int temp=rem;
				fact=fact*rem;
				
				sumFact=sumFact+fact;
			temp--;
				
		     	num=num/10;
			}
		System.out.println(sumFact);
	}

}
