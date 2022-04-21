package pack27;



@FunctionalInterface
interface Drawable{  //Functional interface a interface which has single abstract method
	void draw();  //Lambda expression can be applied to a functional interface
	// with no return type and no arg
	}

public class LambdaEx1 {

	public static void main(String[] args) {
		Drawable dob=()->{
			// body of the function
			System.out.println("draw method body");
		};
		dob.draw();
	}

}
