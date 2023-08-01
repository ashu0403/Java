package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*;

public class SalesDataAnalyzer {
    // This method reads a file and adds each line of the file into the
    // corresponding SalesRecord object
    public SalesRecord[] readFile(String fileName) {
        SalesRecord[] sale = new SalesRecord[100];
        String check;
        int i = 0;
        try {
            FileReader f = new FileReader(fileName);
            BufferedReader b = new BufferedReader(f);
            b.readLine();
            while ((check = b.readLine()) != null) {
                String[] detail = new String[100];
                detail = check.split(",");
                String date = detail[0];
                int custmor_id = Integer.parseInt(detail[1]);
                int product_category = Integer.parseInt(detail[2]);
                String payment_method = detail[3];
                double amount = Double.parseDouble(detail[4]);
                double time_on_site = Double.parseDouble(detail[5]);
                int clicks_in_site = Integer.parseInt(detail[6]);
                sale[i] = new SalesRecord(date, custmor_id, product_category, payment_method, amount, time_on_site,
                        clicks_in_site);
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("sales record");
        } catch (IOException ex) {
            System.out.println("ex");
        }
        return sale;
    }
}
