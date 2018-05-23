package basics;

public class CalcArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare & define the array (only size)
				int[] arr1 = { 1, 2, 3, 4, 5, 1 };
				System.out.println(mini(arr1));
				System.out.println(max(arr1));
				System.out.println(ave(arr1));
				
	}			
	
	
	public static int mini(int[] arr2) {
		
		int answer = arr2[0];
		int length = arr2.length;
		
		int low = arr2[0];
		
		while(length > 0) {
		
			if( low > arr2[length-1]) {
				low = arr2[length-1];
			}
			
		length--;	
		}
		
		return low;
		

	}
	
	public static int max(int[] arr2) {
		int high = arr2[0];
		int length = arr2.length;
		
		while(length > 0) {
			
			if( high < arr2[length-1]) {
				high = arr2[length-1];
			}
			
		length--;	
		}
		
		
		return high;
		
	}
	
	public static double ave(int[] arr2) {
		double aver = 0;
		int length = arr2.length;
		double items = arr2.length;
		
		while(length > 0) {
			
			aver = aver + arr2[length-1];	
			length--;	
		}
		double result = aver/items;
		return result;
		
	} 
	
	
	
}