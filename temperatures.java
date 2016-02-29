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
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        int tempToDisplay = 100001;
        int tempToCompare = 0;
        tempToCompare = n;
        System.err.println("Temps is: "+temps);
        if(tempToCompare == 0)
        {
            System.out.println("0");
        }
        else
        {
            String[] tempsArray = temps.split("\\s+");
        
            for (int i = 0; i < tempsArray.length; i++)
            {
                tempToCompare = Integer.parseInt(tempsArray[i]);
                tempToCompare = Math.abs(tempToCompare);
                if(tempToDisplay > tempToCompare)
                {
                    tempToDisplay = tempToCompare;
                }
            }
            
            System.out.println(tempToDisplay);
        }
        
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
    }
}