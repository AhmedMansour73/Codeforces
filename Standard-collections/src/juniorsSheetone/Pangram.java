
package juniorsSheetone;

import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Ahmed Mansour
 */
public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strLenth = scanner.nextInt();
        String word = scanner.next();
        if(strLenth < 26)
        {
            System.out.println("NO");
        }else
        {
            word =word.toLowerCase();
            word =word.chars()
            .distinct()
            .sorted()
            .mapToObj(c -> String.valueOf((char)c))
            .collect(Collectors.joining());
            
            if(word.length() == 26)
                System.out.println("Yes");
            else
                System.out.println("No");
            
        }
    }
}


/**
 * 
 *
 TreeSet<Character> set = new TreeSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        
        // Build the result string
        StringBuilder result = new StringBuilder();
        for (Character c : set) {
            result.append(c);
        }
        
        System.out.println("Original: " + str);
        System.out.println("Sorted without duplicates: " + result);
 
 */