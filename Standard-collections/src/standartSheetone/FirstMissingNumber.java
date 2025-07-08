
package standartSheetone;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ahmed Mansour
 */
public class FirstMissingNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        int size = scanner.nextInt();
        int minMaxNumber = scanner.nextInt();
        
        int[] arr =new int[size];
        
        for (int i = 0; i < size ; i++) {
            arr[i] = scanner.nextInt();
        }
        
         Arrays.sort(arr); 
         
          for (int i = -minMaxNumber; i <= minMaxNumber ; i++) {
           if (Arrays.binarySearch(arr, i) < 0) {
                // x is not in the array return -1 ,if nuber  found in the array return Index
                System.out.println(i);
                return;
           }
        }
           
         
        System.out.println( Arrays.toString(arr));
        
    }
}
