import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> powerSort = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            powerSort.add(pi);
            
        }
        
        Collections.sort(powerSort);
        
        int difference = 0;
        int smallestPowerDifference = 10000000;
        int i = powerSort.size();
        do
        {
            i--;
            if(i != 0)
            {
               difference = powerSort.get(i) - powerSort.get(i - 1);

            }
            if(difference < smallestPowerDifference)
            {
                smallestPowerDifference = difference;
            }
            
        }while(i != 0);
        
        System.out.println(smallestPowerDifference);
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }
}