package program;

public class MaxSubArrayOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,20,-5,5,6,2};
		int n=0;
		System.out.println(maxSubArray(arr,n));
	}
	public static int maxSubArray(int arr[],int n) {
		int maxSum=arr[0];
		int sum=arr[0];
		for (int i = 0; i < arr.length; i++) {

			if(arr[i]<0) {
				sum=sum+arr[i];
			}
			else {
				sum=sum+arr[i];

			}
			maxSum=Math.max(maxSum,sum);
		}
		return maxSum;
	}


}
