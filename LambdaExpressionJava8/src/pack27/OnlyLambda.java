package pack27;



@FunctionalInterface
interface Drawable{  //Functional interface a interface which has single abstract method
	void draw();  //Lambda expression can be applied to a functional interface
	}

public class OnlyLambda {

	public static void main(String[] args) {
		Drawable dob=()->{
			// body of the function
			System.out.println("draw method body");
		};
		dob.draw();
		
		// Thread class Runnable interface
		Runnable rob=()->{
			System.out.println("Run method is called");
		};
		Thread tob=new Thread(rob);// Runnable object is access
		tob.start();
	}

}
