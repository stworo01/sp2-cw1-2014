/** 
    A program that takes two user inputed arrays and carries out the following
    operations:
    Takes user input for two arrays excluding duplicated numbers
    Lists the two arrays
    Lists the numbers that are common to both arrays
    Displays how many numbers are common to both arrays
    Lists the values that only occur in the first array
    Lists the values that only occur in the second array
    
    @author Stefan Tworogal
    @version 2.

*/
import java.util.Scanner;
import java.util.Arrays;

public class CourseWork1 {
    // variables
    final static int LENGTH = 4;
    static int[] a = new int[LENGTH];
	static int[] b = new int[LENGTH];

    public static void main(String[] args) {
        readInputs();
        dup();
    }// end main
    /** 
        Takes user inputs for two arrays, prints out the twom arrays
    */
    public static void readInputs() {
                Scanner input = new Scanner(System.in);
        // fill array a
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter number for array 1");
			a[i] = input.nextInt();
            if(a[i] == 0) {
                break;
            }// end if
		} //end for
		//fill array b
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter number for array 2");
			b[i] = input.nextInt();
            if(b[i] == 0) {
                break;
            }// end if
        }// end for
        System.out.println("The contents of array 1 are: "+ Arrays.toString(a));
		System.out.println();
		System.out.println("The contents of array 2 are: "+ Arrays.toString(b));
        input.close();
    }// end readInputs
    /**
        Prints out the duplicated numbers the two arrays
    */
    public static void dup() {
        int count = 0;
        System.out.print("duplicates are: ");
         for(int i = 0; i < a.length; i ++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    int dup = a[i];
                    count++;
                    System.out.print(dup+ " ");
                } // end if
            } //end for
        }// end for
        System.out.println();
        System.out.println("There are " + count);
    } //end dup


}// end class
