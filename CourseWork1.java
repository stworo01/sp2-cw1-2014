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

public class CourseWork1 {
    // variables
    final static int LENGTH = 100;
    static int[] a = new int[LENGTH];
	static int[] b = new int[LENGTH];


    public static void main(String[] args) {
        readInputs();
     
        
        
      
    }// end main
    /** 
        Takes user inputs for two arrays, prints out the two arrays
    */
    public static void readInputs() {
        Scanner input = new Scanner(System.in);
        //variables to keep fill size of arrays
        int aSize;
        int bSize;
        // fill array a     
		for(aSize = 0; aSize < a.length; aSize++) {
			System.out.println("Enter number for array 1");
			a[aSize] = input.nextInt();
            if(a[aSize] == 0) {
            	break;
                
            }// end if
		} //end for
		//fill array b
		for(bSize = 0; bSize < b.length; bSize++) {
			System.out.println("Enter number for array 2");
			b[bSize] = input.nextInt();
            if(b[bSize] == 0) {
             
               
                break;
            }// end if
        }// end for
		//print the elements of the arrays
		if(aSize == 0 && bSize == 0) { 
			System.out.println("Both arrays are empty");
	      

		
		} else {
			System.out.print("The elements of Array 1 are: ");
			for(int i = 0; i < aSize; i++ ) {
				System.out.print(" "+a[i]);
			} //end for
			System.out.println();
		
			System.out.print("The elements of Array 2 are: ");
			for(int i = 0; i < bSize; i++) {
				System.out.print(" "+b[i]);
			} //end for
			System.out.println();
			  dup();
		      nDup();
		}
        input.close();
      
   
    }// end readInputs
    
    
    
    
    
    
    
    
  
    /**
        Prints out the duplicated numbers the two arrays
    */
    public static void dup() {
        int count = 0;
        System.out.print("The numbers that are duplicated are: ");
         for(int i = 0; i < a.length; i ++) {
            for (int j = 0; j < b.length; j++) {  	
            	if(a[i] == 0) { break;} //prevent zero's being printed
                if(a[i] == b[j]) {
                    int dup = a[i];
                    count++;
                    System.out.print(dup+ " ");
                } 
            } //end for
        }// end for
        System.out.println();
        System.out.println("There are " + count+" duplicates");     
    } //end dup
    
    
    /** prints out the elements that are not duplicated in the arrays
     * 
     */
    public static void nDup() {
    	int count;
    	System.out.print("The elements that are in A but not B are: ");
    	for(int i = 0; i < a.length; i++) {
    		count = 0;
    		for(int j = 0; j < b.length; j++) {
    			if(a[i] == 0) { break;}
    			if(a[i] != b[j]) {
    				count++;
    				if(count == a.length ) { 
    					int nDup = a[i];
    					System.out.print(nDup+ " ");
    				}
    			}
    		}
    		
    		
    	}
    	System.out.println();
    	System.out.print("The elements that are in B but not A are: ");
    	
    	for(int i = 0; i < b.length; i++) {
    		count = 0;
    		for(int j = 0; j < b.length; j++) {
    			if(b[i] == 0) { break;}
    			if(b[i] != a[j]) {
    				count++;
    				if(count == b.length ) { 
    					
    					int nDup = b[i];
    					System.out.print(nDup+ " ");
    				}
    			}
    		}
    		
    		
    	}
    }
}// end class


