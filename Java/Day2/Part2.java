/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adventofcode2015;

import java.util.Scanner;

/**
 *
 * @author smutn
 */
public class AdventOfCode2015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "4x23x21";            
        int sum = 0;
        int a, b, c = 0;
        Scanner scanner = new Scanner(input);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split("x");
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);
            c = Integer.parseInt(parts[2]);

            sum += a * b * c;

            if (a <= c && b <= c) { // a,b
                System.out.println("ab");
                sum += 2 * a + 2 * b;
            } else if (b <= a && c <= a) { //b,c
                sum += 2 * b + 2 * c;
                System.out.println("bc");
            } else { //a,c
                sum += 2 * a + 2 * c;
                System.out.println("ac");
            }

        }
        scanner.close();
        System.out.println(sum);

    }

}
