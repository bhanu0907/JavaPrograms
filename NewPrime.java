package program;

public class NewPrime {

	public static void main(String[] args) {
		int num=3;
		int limit=100;
		boolean prime=false;
		int count=0;
		for(int i=2;i<100;i++) {
			
			if(num%num==0 && num%1==0 && num%i!=0){
				count++;
				System.out.println(num);
				prime=true;
			}
			else {
				prime=true;
			}
		
			num++;
		}
		System.out.println(count);
		System.out.println(prime);
		
	}

}
