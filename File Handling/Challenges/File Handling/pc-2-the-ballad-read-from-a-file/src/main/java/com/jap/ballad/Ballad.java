package com.jap.ballad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class Ballad {

    public String readPoemFromAFile(String fileName) throws FileNotFoundException {
        // Write the logic to read from a file
        String str = "";
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String c;
            while ((c = br.readLine()) != null) {
                str = str.concat("\n" + c);

            }
        } catch (Exception e) {
            str = "Data from file does not match";
        }
        return str;
    }

}