package basics;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SumNumbers(10));

	}
	//write a function that takes a value N and returns the sum of 1 to N
	public static int SumNumbers(int n) {
		
			int sum = n;
			while(n != 0) {
				sum = sum + (n-1);
				n--;
			}
			return sum;
		
			
	}

}
