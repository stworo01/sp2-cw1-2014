/**
  @author Stefan Tworogal
*/
import java.util.Scanner;
import java.util.Arrays;
public class CourseWork1 {
	final static int LENGTH = 4;
	public static void main(String[] args) {
		//declare 2 arrays
		int[] a = new int[LENGTH];
		int[] b = new int[LENGTH];
		// declare scanner to allow input from user
		Scanner input = new Scanner(System.in);
		
		// fill array a
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter number for array 1");
			a[i] = input.nextInt();
            if(a[i] == 0) {
                break;
            }
			
		}
		//fill array b
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter number for array 2");
			b[i] = input.nextInt();
            if(b[i] == 0) {
                break;
            }

	}
		// print the arrays
		
		
		System.out.println("The contents of array 1 are: "+ Arrays.toString(a));
		System.out.println();

		System.out.println("The contents of array 2 are: "+ Arrays.toString(b));
	
		//close the scanner
		input.close();

}
}
