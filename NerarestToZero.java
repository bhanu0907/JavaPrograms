package program;

public class NerarestToZero {

	public static void main(String[] args) {
		

		int[] arr = {2,5,10,20,-5,-8,-2};
		
	//	int min = Integer.MAX_VALUE;
		//System.out.println(min);
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int temp= arr[i]<0 ? -arr[i] : arr[i];
	//		(a < 0) ? -a : a;
			if(temp <min)
			{
				min = arr[i];
				//indx = i;
			}
			//Math.abs(temp)
	
		}
		System.out.println(min);
		
		
	}

}
