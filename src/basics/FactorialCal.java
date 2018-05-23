package basics;

public class FactorialCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));

	}
	
	public static int fact(int n) {
		if(n == 0 || n == 1 ) {
			return 1;
		}
		
		else {
			int calc = n;
			
			while(n != 1) {
			calc = calc * (n-1);
			n--;
			}
			
			return calc;
		}
	}
	

}
