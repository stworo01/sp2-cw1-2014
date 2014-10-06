/** 
    A program that takes two user input arrays and carries out the following
    operations:
    Takes user input for two arrays  *excluding duplicated values.
    Displays the values for the first array.
    Displays the values for the second array.
    Displays that occur in both arrays.
    Lists the values that only occur in the first array.
    Lists the values that only occur in the second array.
    * This is not implemented.
    @author Stefan Tworogal
    @version 2.

*/
import java.util.Scanner;
public class CourseWork1 {
    // variables
    final static int LENGTH = 100;
    static int[] a = new int[LENGTH];
  	static int[] b = new int[LENGTH];

    public static void main(String[] args) {
        readInputs();
    }

    /** 
      Method gets user input for two array and print out the elements of the
      arrays. If the arrays are both empty it prints out a message stating that
      the arrays are empty.
    */
    public static void readInputs() {
        Scanner input = new Scanner(System.in);
        //variables to keep fill size of arrays
        int aSize; // filled size of array 1
        int bSize; // filled size of array 2
        // fill array 1     
		for(aSize = 0; aSize < a.length; aSize++) {
			System.out.println("Enter data for array 1 ( 0 to finish)");
			a[aSize] = input.nextInt();
			if(a[aSize] == 0) { // no elements in array 1
				break;
			}
		} 
		//fill array 2
		for(bSize = 0; bSize < b.length; bSize++) {
			System.out.println("Enter data for array 2 ( 0 to finish)");
			b[bSize] = input.nextInt();
			if(b[bSize] == 0) { // no elements in array 2
				break;
			}	
		}
		//print the elements of the arrays
		if(aSize == 0 && bSize == 0) { // Test if both arrays are empty
			System.out.println("Both arrays are empty");
		} else {
			System.out.print("Values for array 1 is: ");
			for(int i = 0; i < aSize; i++ ) {
				System.out.print(" "+a[i]);
			} 
			System.out.println();
			System.out.print("Values for array 2 is: ");
			for(int i = 0; i < bSize; i++) {
				System.out.print(" "+b[i]);
			} 
			System.out.println();
      // call other methods
			dup();
		  nDup();
		  }
      input.close();
    }
  
    /**
      Method that compares the two arrays and prints out the elements that are
      in both arrays and gives count of those elements.
    */
    public static void dup() {
        int count = 0;
        System.out.print("Common data is: ");
         for(int i = 0; i < a.length; i ++) {
            for (int j = 0; j < b.length; j++) {  	
            	if(a[i] == 0) { break;} //prevent zero's being printed
                if(a[i] == b[j]) {
                    int dup = a[i];
                    count++;
                    System.out.print(dup+ " ");
                } 
            } 
        }
        System.out.println();
        System.out.println("Number of common data is " + count);     
    } 
   
   /** 
      Method that print out the elements that are not common in each array
    */
    public static void nDup() {
    	int count;
    	System.out.print("Non-common values for array 1 is: ");
    	for(int i = 0; i < a.length; i++) {
    		count = 0;
    		for(int j = 0; j < b.length; j++) {
    			if(a[i] == 0) { break;} // prevent zero's being printed
    			if(a[i] != b[j]) {// Test if element is not in both arrays
    				count++; 
    				if(count == a.length ) { // checked whole array
    					int nDup = a[i];
    					System.out.print(nDup+ " ");
    				}
    			}
    		}
    	}
    	System.out.println();
    	System.out.print("Non-common values for array 2 is: ");
    	for(int i = 0; i < b.length; i++) {
    		count = 0;
    		for(int j = 0; j < b.length; j++) {
    			if(b[i] == 0) { break;} // prevent zero's being printed
    			if(b[i] != a[j]) { // Test if element is not in both arrays
    				count++;
    				if(count == b.length ) { // checked whole array
    					int nDup = b[i];
    					System.out.print(nDup+ " ");
    				}
    			}
    		}
    	}
    }
}

