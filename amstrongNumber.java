package program;

public class amstrongNumber {

	public static void main(String[] args) {
		System.out.println(amstrongNumber.armKing());

	}
	public static boolean armKing() {
		int a=153;
		int	orginal=a;
		//int rem=0;
		int armStrong=0;
		for(int i=0;a>0;i++) {
			int	rem=a%10;
			//temp=temp+rem;
			//	rem= (int) Math.pow(rem,3);
			rem=rem*rem*rem;
			armStrong=armStrong+rem;
			a=a/10;
		}
		if (orginal==armStrong) {
			return true;
		} 
		else {
			return false;
		}
	}

}



