package numbers;

public class Fibonacci {
	int i;
	long a=0;
	long b=1;
	long c;
	public void fib(int x) {
		System.out.println("Fibonacci series");
		System.out.println(a);
		System.out.println(b);
	 for(i=2; i<x; ++i) {
		 c=a+b;
		 
		 System.out.println(c);
		 a=b;
		 b=c;
	
		
	 }
	 //System.out.println(c);
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		f.fib(100);
	}
}
