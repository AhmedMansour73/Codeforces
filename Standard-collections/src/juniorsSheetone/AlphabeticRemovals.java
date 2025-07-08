
package juniorsSheetone;

import java.util.Scanner;

/**
 *
 * @author Ahmed Mansour
 */
public class AlphabeticRemovals {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int strLength =scanner.nextInt();
        int sizeRemove =scanner.nextInt();
        
        String word = scanner.next();
        
        int start = 'a';
        int index;
        
        while(sizeRemove > 0) {
            
            
              if( word.indexOf((char) start) != -1 )
              {
                  index = word.indexOf((char)start);
                    if (index != -1) {
                        word = word.substring(0, index) + ' ' + word.substring(index + 1);
                    }
                  sizeRemove--;
                  
              }else
              {
                  start++;
              }
              
            }
        
        
        word =word.replace(" ", "");
        
        System.out.println(word);
        
    }
}

// boolean containsChar = str.toLowerCase().indexOf((char)(asciiValue + 32)) != -1;
// boolean containsChar = str.contains(String.valueOf((char)asciiValue));
//boolean containsChar = str.indexOf((char)asciiValue) != -1;

/**
 *        for (int j = 0; j < strLength; j++) {
            if(sizeRemove == 0)
                break;
            if(word.charAt(j) == start)
            {
              word =  word.substring(0, j) + ' ' + word.substring(j + 1);
              sizeRemove--;
              if( !(word.indexOf((char)start) != -1) )
              {
                  start++;
              }
              if(sizeRemove != 0 && j == strLength-2 )
              {
                  j=0;
              }
            }
        }
        
 */