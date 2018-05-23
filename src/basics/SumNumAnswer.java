package basics;

public class SumNumAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5));
	}
	// write a fuction that takes a value N and returns the sum 1 to n
	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i<=n;i++) {
			sum=sum+i;
			
		}
		return sum;
	}

}
