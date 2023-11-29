package program;

public class EnterlElmentInParticulurArray {

	public static void main(String[] args) {
		int []a= {10,20,30,40};
		int []b=new int[a.length-1];
		int element=50;
		int index=2;
		b[index]=element;
		for(int i=0; i<b.length+1;i++) {
			if (i<index) {
				b[i]=a[i];		
			}
			else {
				b[i]=a[i+1];
			}
		}
	}

}
