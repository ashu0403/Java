package com.jap.collectiondemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MobileStore {

    private List<Mobile> allMobiles;
    private String record = "";
    private String splitBy = ",";

    public MobileStore() {
        allMobiles = new ArrayList<>();

    }

    // Write logic to read the fileName that is "mobile.csv"

    // read all the lines one by one
    // Create Mobile class object and store data from file in the respective
    // attributes of Mobile class
    // ex - Store brandName - Samsung in mobile.setBrandName(brandName);
    // add mobile object in the List object and return the List
    // handle all the exceptions
    public List<Mobile> readMobileData(String fileName) {
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            allMobiles = new ArrayList();
            br.readLine();
            String count;

            while ((count = br.readLine()) != null) {

                String[] details = new String[100];
                details = count.split(splitBy);
                String Brand_Name = details[0];
                String Model_Name = details[1];
                double cost = Double.parseDouble(details[2]);
                String size = details[3];
                String Battery = details[4];
                String Storage_spac = details[5];
                int Camera_Pixel = Integer.parseInt(details[6]);
                allMobiles.add(new Mobile(Brand_Name, Model_Name, cost, size, Battery, Storage_spac, Camera_Pixel));
            }

            return allMobiles;
        } catch (Exception e) {
        }
        return allMobiles;
    }

    // Iterate the List created in the above method and retrieve the bandName
    // Return the List with specific Mobile having brandName coming from method
    // parameter
    public List<Mobile> findPhoneByBrand(String brandName) {
        List<Mobile> mobilesByBrand = new ArrayList<>();
        try {
            for (Mobile mob : allMobiles) {
                if (mob.getBrandName().equals(brandName)) {
                    mobilesByBrand.add(mob);
                }
            }

            return mobilesByBrand;
        } catch (Exception e) {

        }
        return mobilesByBrand;
    }

    // Iterate through the List created in the first method
    // Return the List of Mobile whose cost is more than $500
    public List<Mobile> findPhoneCostMoreThan$500() {
        List<Mobile> mobilesMoreThan500 = new ArrayList<>();
        try {
            for (Mobile mob : allMobiles) {
                if (mob.getCost() > 500) {
                    mobilesMoreThan500.add(mob);
                }
            }

            return mobilesMoreThan500;
        } catch (Exception e) {

        }
        return mobilesMoreThan500;
    }

    // Iterate through the List created in the first method
    // Return the List of Mobile whose Pixel is more than 12MP
    public List<Mobile> findPhonePixelMoreThan12MP() {
        List<Mobile> mobilesMoreThan12MP = new ArrayList<>();
        try {
            for (Mobile mob : allMobiles) {
                if (mob.getCameraPixels() > 12) {
                    mobilesMoreThan12MP.add(mob);
                }
            }

            return mobilesMoreThan12MP;
        } catch (Exception e) {

        }
        return mobilesMoreThan12MP;
    }

}
