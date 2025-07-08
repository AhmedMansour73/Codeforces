
package standartSheetone;

import java.util.Scanner;

/**
 * 
 * @author Ahmed Mansour
 */
public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int[] arr = new int[100000] ;
      
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int num1; // add to arr  or print from arr
        int num2; // value
        for (int i = 0; i < q; i++) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            if(num1 == 1)
            {
                arr[num2] = ++arr[num2];
            }else if (num1 == 2 )
            {
                System.out.println(arr[num2]);
            }else
            {
                System.out.println("Your shoce not correct");
            }
            
        }
    }
    
}
// "number "+ num2+ " is exist " + arr[num2] + " once"