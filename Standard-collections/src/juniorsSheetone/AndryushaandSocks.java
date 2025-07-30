
package juniorsSheetone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ahmed Mansour
 */
public class AndryushaandSocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of socks : ");
        int socksNumbers = scanner.nextInt();
        int []arrsocks = new int[socksNumbers*2];
        System.out.println("enter socks szie : ");
        for (int i = 0; i < arrsocks.length ; i++) {
            arrsocks[i] = scanner.nextInt();
        }
        
        
        
        if(socksNumbers == 1)
        {
            System.out.println( "1" );
            System.exit(0);
        }
        List<Integer> wardrobeArr = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < arrsocks.length ; i++) {
            if( !( wardrobeArr.contains(arrsocks[i]) ) )
            {
                wardrobeArr.add(arrsocks[i]);
                counter = wardrobeArr.size();
            }
            else{
                wardrobeArr.remove(Integer.valueOf( arrsocks[i] ));
            }
        }
        
        System.out.println(counter);
        
        
    }
}
