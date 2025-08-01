
public class Calculator {
	
	int m;
	static int n;

	public int add(int i, int j){
		
		int k=0;
		System.out.println("Value of K:"+k);
		return k;
		
	}
	
	public void print(){
		
		//System.out.println("Value of K:"+k);
		m=m+1;
		n=n+1;
		System.out.println("Value of m:"+m);
		System.out.println("Value of n:"+n);
	}
	
	public static void main(String[] args) {
		
		Calculator c1 =  new Calculator();
		c1.print();
		Calculator c2 =  new Calculator();
		c2.print();
		

	}

}
