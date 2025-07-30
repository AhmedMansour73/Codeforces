
package standartSheetone;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Ahmed Mansour
 */
public class CountCharacters {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String value = scanner.nextLine();
        
        // Convert string to char array and sort it
        char[] chars = value.toCharArray();
        Arrays.sort(chars);
        
        // Count character frequencies
        int[] arr = new int[125]; // Assuming ASCII characters
        for (char c : chars) {
            arr[c]++;
        }
        
        
        
        // Print character frequencies (only once per character)
        System.out.println("Character frequencies:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println((char) i + " " + arr[i]);
            }
        }
        
        
    }
}
