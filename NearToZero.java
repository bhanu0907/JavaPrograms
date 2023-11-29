package program;

public class NearToZero {
	public static void main(String[] args) {
//		int [] arr= {2,10,12,-2};
//		int min =arr[0];
//		for(int i=0;i<arr.length;i++) {
//
//			int temp=arr[i]<0? -arr[i] :arr[i];
//			//		int temp= arr[i]<0 ? -arr[i] : arr[i];
//			if(temp<=min) {
//				min=arr[i];
//			}
//		}
//		System.out.println(min);
//	}
		int[] arr= {5,20,-10,-5};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			int temp=arr[i]<0?-arr[i]:arr[i];
			
			if(temp<min) {
				min=arr[i];
				
			}
	//		System.out.println(min);
			
			
		}
		
		
	}
}
