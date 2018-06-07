package numbers;

public class PrimeNumbers {
	
	int i;
	int y;
	int z;
	int count;
	public void method(int x) {
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(5);
		
		for(y = 1; y<=x; y++){
			count=0;
			for (z=y;z>=1;z--) {
				if((y%z)==0) {
					count++;
					//System.out.println("comes inside if loop "+count);
					
					}
				
				}
			if(count==2) {
				System.out.println(y + " is a prime number");
			}
			else {
				System.out.println(y + " is not a prime number");
			}
				
			
			
//			System.out.println(count);
			
			
	}
//		System.out.println(100);
//		System.out.println(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumbers p = new PrimeNumbers();
		
//		System.out.println("hii world"+"  "+p.method(200));
		
		
		p.method(100);

	}

}
