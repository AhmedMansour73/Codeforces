package juniorsSheetone;

import java.util.Scanner;

/**
 *
 * @author Ahmed Mansour
 */
/*
  get two string and check if string 2 letters in string 1 (upper is upper and lower is lower )
 */
public class D_Letter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String. ");
        String strOrigin = scanner.nextLine();  // get String one
        scanner.hasNext();
        String checkStr = scanner.nextLine();   // get String two

        // Count character frequencies 
        // Assuming ASCII characters from 65 to 122
        // Array is Integer Because you want to count the number of times a letter is repeated, not store the letters themselves.
        int[] charsOfOrigin = new int[125];     // make frequencies array to get letters 
        int[] charsOfCheck = new int[125];
        
        for (char charOrigin : strOrigin.replaceAll("\\s+", "").toCharArray()) {
            charsOfOrigin[charOrigin]++;         // get each letter in string 
        }
        for (char charCheck : checkStr.replaceAll("\\s+", "").toCharArray()) {
            charsOfCheck[charCheck]++;         
        }
        
        boolean isValid = true;

        for (int i = 0; i < 125; i++ ) {
            if (charsOfCheck[i] > charsOfOrigin[i]) {
                isValid = false;
                break;
            }
        }

        System.out.println(isValid ? "YES" : "NO");
        

    }

}

//        System.out.println("Character frequencies:");
//        for (int i = 0; i < charsOfOrigin.length; i++) {
//            if (charsOfOrigin[i] > 0) {
//                System.out.println((char) i + " " + charsOfOrigin[i]);
//            }
//        }