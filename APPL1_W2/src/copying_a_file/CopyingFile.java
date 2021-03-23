/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copying_a_file;

/**
 *
 * @author giust
 */
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
public class CopyingFile {
    public static void main(String[] args) {
        String keepLooking = "y";
        Scanner scan = new Scanner(System.in);
        while (keepLooking.equals("y") || keepLooking.equals("Y")){
            System.out.println("Enter the file name. Filename must be followed by a .txt extension(*ex: file-1.txt): ");
        try {
            String fileName = new Scanner(System.in).nextLine();
            File fileLoc = new File("C:\\xampp\\htdocs\\APPL_1\\APPL1_W2\\src\\copying_a_file\\" + fileName);   
            Scanner hasil = new Scanner(fileLoc); 
            while (hasil.hasNextLine()) {
                    System.out.println(hasil.nextLine());
            }
        break;
        }
        catch (FileNotFoundException e){
            System.out.print("Invalid. File don't exist.\n");
        }
        System.out.print("What are you looking for again?(y/n) ");
        keepLooking = scan.next();
        }
    }
}