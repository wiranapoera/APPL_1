/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphic_sorting;
/**
 *
 * @author giust
 */
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] intList;
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many line of strings do you want to sort? ");
        size = scan.nextInt();
        intList = new String[size];

        scan.nextLine();  // To catch new line

        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextLine();

        Sorting.insertionSort(intList);

        scan.close();

        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println();
    }
}
