package pack31;



//java 8 feature default and static method in interface

interface Calulations1{
	void add(int a, int b);
	 default void mult(int a, int b) {
		int m=a*b;
		System.out.println("Calulations product="+m);
		
	}
	 static void sub(int a, int b) {
		 int ans=a-b;
		 System.out.println("Difference="+ans);
		 
	 }
}

interface MyUpdateCalulations{  // update multiple
	default void mult(int a, int b) {
		int m=a*b;
		System.out.println("MyUpdateCalulations product="+m);
		
	}
	void myfunct();
}

public class DefaultMethodEx1 implements Calulations,MyUpdateCalulations {
	@Override
	public void add(int a, int b) {
		int s=a+b;
		System.out.println("sum="+s);
		
	}
	@Override
	public void myfunct() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mult(int a, int b) {   // update multiple
		Calulations.super.mult(a, b);
		MyUpdateCalulations.super.mult(7, 9);
	}
	public static void main(String[] args) {
		DefaultMethodEx1 ob=new DefaultMethodEx1();
		ob.add(4, 6);
		ob.mult(8, 6);
		Calulations1.sub(8,2);
}}
