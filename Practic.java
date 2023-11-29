package program;

public class Practic {

	public static void main(String[] args) {
		// comute the length of the largest subarray with 0
		int []arr= {1,0,2};
		int	max_length=0;
		int count=0;
			for(int i=0;i<arr.length;i++) {
				int cur_sum=0;
				for(int j=i;j<arr.length;j++) {
					cur_sum +=arr[j];
					if(cur_sum==0);
					{
						max_length=Math.max(max_length, j-i+1);
					//	count++;
					}
				}
		}
System.out.println(max_length);
//System.out.println(count);


}}
