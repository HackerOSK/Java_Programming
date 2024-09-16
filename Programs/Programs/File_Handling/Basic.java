package Programs.File_Handling;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Basic {
    public static void main(String[] args) throws Exception {
        File fp = new File("O:\\Java_Programming\\Programs\\Programs\\File_Handling\\test.txt");
//        fp.createNewFile();
//        FileWriter fw = new FileWriter(fp);
//        BufferedWriter bfw = new BufferedWriter(fw);
//        bfw.write("Hello Welcome to JAVA FileHandling!");
//        bfw.append("\nMy Name is Omkar!");
//        bfw.close();
        FileReader fr = new FileReader(fp);
        BufferedReader bfr = new BufferedReader(fr);
        char buffer[] = new char[100];
        bfr.read(buffer,0,100);
        System.out.println(Arrays.toString(buffer));



    }
}
