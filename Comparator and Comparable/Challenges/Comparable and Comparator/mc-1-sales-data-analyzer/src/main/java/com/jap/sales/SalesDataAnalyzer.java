package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.*;

public class SalesDataAnalyzer {
    // Read the data from the file and store in a List
    public List<SalesRecord> readFile(String fileName) {
        List<SalesRecord> list = new ArrayList();
        String check;
        BufferedReader b;
        try {

            b = new BufferedReader(new FileReader(fileName));
            b.readLine();
            while ((check = b.readLine()) != null) {
                String[] details = new String[100];
                details = check.split(",");
                String date = details[0];
                int customer_id = Integer.parseInt(details[1]);
                int product_category = Integer.parseInt(details[2]);
                String payment_method = details[3];
                double amount = Double.parseDouble(details[4]);
                double time_on_site = Double.parseDouble(details[5]);
                int clicks_in_site = Integer.parseInt(details[6]);

                SalesRecord s1 = new SalesRecord(date, customer_id, product_category, payment_method, amount,
                        time_on_site, clicks_in_site);
                list.add(s1);

            }
            return list;
        } catch (IOException e) {

        }

        return list;
    }

    // Sort the customers based on purchase amount
    public List<SalesRecord> getAllCustomersSortedByPurchaseAmount(List<SalesRecord> salesData,
            AmountComparator amountComparator) {
        amountComparator = new AmountComparator();
        Collections.sort(salesData, amountComparator);
        Collections.reverse(salesData);

        return salesData;
    }

    // Find the top customer who spent the maximum time on the site
    public SalesRecord getTopCustomerWhoSpentMaxTimeOnSite(List<SalesRecord> salesData,
            TimeOnSiteComparator timeOnSiteComparator) {

        timeOnSiteComparator = new TimeOnSiteComparator();
        Collections.sort(salesData, timeOnSiteComparator);

        return salesData.get(salesData.size() - 1);

    }

}
