package pack32;

import java.util.function.Predicate;

public class GreaterNumberUsingPredicate {

	public static void main(String[] args) {
		Predicate<Integer> gt=(i)->i>10;
		System.out.println("Is my number is greater than");
		boolean b=gt.test(40);
		if(b) {
			System.out.println("greater than 10");
		}
		else {
			System.out.println("less than 10");
		}

	}

}
