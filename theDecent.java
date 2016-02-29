import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();
            int[] mountain = new int [9];
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();
                mountain[i] = mountainH;
// represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
            }
            
            
            int x = 0;
            int mountainToFire = 0;
            
            for (int i = 0; i < mountain.length - 1; i++)
            {
                if(x < mountain[i])
                {
                    x = mountain[i];
                    mountainToFire = i;
                }
            }
            System.err.println("This is SpaceX " + spaceX);
            System.err.println("This is mountainToFire" + mountainToFire);
            if(mountainToFire == spaceX)
            {
                System.out.println("FIRE");
            }
            else
            {
                System.out.println("HOLD");
            }

         // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
        }
    }
}