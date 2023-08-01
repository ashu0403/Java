package com.jap.sales;

import java.util.Comparator;

public class AmountComparator implements Comparator<SalesRecord>{
    public int compare(SalesRecord a, SalesRecord b){
        return (int) (a.getAmount() - b.getAmount());
    }

}
