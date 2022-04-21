package pack11;
import java.util.Scanner;
public class Studentgrade {

	public static void main(String[] args) {
		

		/**
		 * @param args
		 */
		
			int marks;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter student marks");
			marks = sc.nextInt();
			if(marks>=90 &&  marks<=100){
				System.out.println("Grade A");
			}
			else if(marks>=70 && marks<=89){
				System.out.println("Grade B");
			}
			else if(marks>=40 && marks<=69){
				System.out.println("Grade C");
			}
			else if(marks>=0 && marks<=39){
				System.out.println("Grade C");
			}
			else {
				System.out.println("Invalid");
			}
			

		}

	}

	
