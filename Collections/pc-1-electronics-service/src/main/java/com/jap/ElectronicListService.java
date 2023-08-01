package com.jap;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    // add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = new ArrayList<>();
        String Arr[] = electronicsItems.split(",");
        for (int i = 0; i < Arr.length; i++) {
            if (itemList.contains(Arr[i])) {
            } else {
                itemList.add(Arr[i]);
            }
        }
        return itemList;
    }

    // search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).equals(searchItem)) {
                return i;
            }
        }
        return -1;
    }

    // remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem) {
        boolean flag = false;
        List<String> itemList1 = new ArrayList<>();
        for (int i = 0; i < itemList1.size(); i++) {
            if (itemList1.get(i).equals(removeItem)) {
                itemList1.remove(i);
            }
        }
        return flag;
    }
}