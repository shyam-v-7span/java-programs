package File

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        //for create new file
        File myfile = new File("html notes.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // write content in file
        try {
            FileWriter fl = new FileWriter("html notes.txt");
            fl.write("hello djjdjjd");
            fl.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read the content of file

        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }

        //for delete a file

        if(myfile.delete()){
            System.out.println("file deleted successfully");
        }
        else{
            System.out.println("Unknown error occure");
        }
    }
}
