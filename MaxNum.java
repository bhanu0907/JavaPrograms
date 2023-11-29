package program;

class MaxNum {

	public static void main(String[] args) {
		//		int []num= {20,30,50,70,10};
		//		int max=num[0];
		//		int index=0;
		//
		//		for(int i=0;i<num.length;i++) {
		//			if(num[i]<max) {
		//				max=num[i];
		//				index=i;
		//			}
		//		}
		//		System.out.println(max);
		//		System.out.println(index);

		String []a= {"bhanu","dmkasnfnf","mhsdbmsbs","djasdbkkkkjs"};
		String maxString=a[0];
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i].length()<maxString.length()) {
				maxString=a[i];
				index=i;
			}
		}
		System.out.println(maxString);
		System.out.println(index);


	}

}


