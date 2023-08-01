package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SalesDataAnalyzer {
   public List<SalesRecord> readFile(String fileName) {

      List<SalesRecord> list = new ArrayList();
      String check;
      BufferedReader b;
      FileReader f;
      try {
         f = new FileReader(fileName);
         b = new BufferedReader(f);
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

            SalesRecord s1 = new SalesRecord(date, customer_id, product_category, payment_method, amount, time_on_site,
                  clicks_in_site);
            list.add(s1);
         }
         return list;
      } catch (IOException e) {
      }
      return list;
   }

   public List<SalesRecord> getAllCustomersSortedByPurchaseAmount(List<SalesRecord> salesData) {
      Comparator<SalesRecord> recordSort = (n, m) -> {
         if (m.getAmount() > n.getAmount()) {
            return 1;
         } else if (m.getAmount() < n.getAmount()) {
            return -1;
         } else
            return 0;
      };

      Collections.sort(salesData, recordSort);
      return salesData;
   }

   public SalesRecord getTopCustomerWhoSpentMaxTimeOnSite(List<SalesRecord> salesData) {
      Comparator<SalesRecord> recordSort = (n, m) -> {
         if (m.getTime_on_site() > n.getTime_on_site()) {
            return 1;
         } else if (m.getTime_on_site() < n.getTime_on_site()) {
            return -1;
         } else
            return 0;
      };
      Collections.sort(salesData, recordSort);
      return salesData.get(0);
   }
}