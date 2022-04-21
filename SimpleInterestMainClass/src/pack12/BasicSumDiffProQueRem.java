package pack12;

public class BasicSumDiffProQueRem {

	public static void main(String[] args) {
	int n1=4;
	int n2=6;
	int s,diff,p,q,rem;
	s=n1+n2;
	System.out.println("The sum of "+n1+" and "+n2+" is "+s);
	diff=n1-n2;
	System.out.println("The difference of "+n1+" and "+n2+" is "+diff);
	p=n1*n2;
	System.out.println("The product of "+n1+" and "+n2+" is "+p);
	q=n1/n2;
	System.out.println("The quotient of "+n1+" and "+n2+" is "+q);
	rem=n1%n2;
	System.out.println("The remainder of "+n1+" and "+n2+" is "+rem);
}
}