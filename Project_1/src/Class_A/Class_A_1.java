package Class_A;

public class Class_A_1 
{
	public int sum(int a,int b) {
		int r;
		r=a+b;
		System.out.println("sum result is " +r);
		return r;
	}
	public int sub(int a1, int a2) {
		int a3;
		a3=a1-a2;
		System.out.println("substraction result is " +a3);
		return a3;
	}
	public void mul(int b1, int b2) {
		int result;
		result=b1*b2;
		System.out.println("multiplication result is " +result);
		
	}
	//result of (10+2)*(10-2)
	public static void main(String[] args) {
		Class_A_1 obj=new Class_A_1();
			int sumresult =obj.sum(10,2);
			int subresult=obj.sub(10,2);
			obj.mul(sumresult, subresult);
		
		
		
	}
	

}
