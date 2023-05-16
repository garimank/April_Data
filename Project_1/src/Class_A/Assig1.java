package Class_A;

public class Assig1 {
	public int sum(int a1,int b1) {
		int r1=a1+b1;
		return r1;
		
	}
	public int sub(int a2,int b2) {
		int r2=a2-b2;
		return r2;
		
	}
	public int mul(int a3, int b3) {
		int r3=a3*b3;
		return r3;
	}
	public int div(int a4, int b4) {
		int r4= a4/b4;
		return r4;
		
		
	}
	//result of ((((10*2)+2)-2)-2)/2
public static void main(String[] args) {
	//Assig1 obj1=new Assig1();
	//int P=obj1.mul(10,2);
	//int Q=obj1.sum(P,2);
	//int R=obj1.sub(Q,2);
	//int S=obj1.sub(R, 2);
	//int T=obj1.div(S, 2);
	//System.out.println("result is =" +T);
	
	
	//Result of((((10+2)+2)-2)*2)/2)
	
	Assig1 obj1=new Assig1();
	int P=obj1.sum(10,2);
	int Q=obj1.sum(P,2);
	int R=obj1.sub(Q,2);
	int S=obj1.mul(R, 2);
	int T=obj1.div(S, 2);
	System.out.println("result is =" +T);

	
			
	
	
	
}
}
