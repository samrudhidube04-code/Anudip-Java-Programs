//1.Write a Program to Display below pattern.

public class Pattern1 {

	public static void main(String[] args) {
		
		
		        int n = 5;   // number of rows for top half

		        // Upper half
		        for (int i = 1; i <= n; i++) {

		            // Print spaces
		            for (int j = i; j < n; j++) {
		                System.out.print(" ");
		            }

		            // Print stars
		            for (int k = 1; k <= (2 * i - 1); k++) {
		                System.out.print("*");
		            }

		            System.out.println();
		        }

		        // Lower half
		        for (int i = n - 1; i >= 1; i--) {

		            // Print spaces
		            for (int j = n; j > i; j--) {
		                System.out.print(" ");
		            }

		            // Print stars
		            for (int k = 1; k <= (2 * i - 1); k++) {
		                System.out.print("*");
		            }

		            System.out.println();
		        }
		    }

	}

/*  *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

  
