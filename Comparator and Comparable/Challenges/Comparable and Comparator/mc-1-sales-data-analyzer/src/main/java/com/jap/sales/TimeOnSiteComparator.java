package com.jap.sales;

import java.util.*;

public class TimeOnSiteComparator implements Comparator<SalesRecord> {
    public int compare(SalesRecord a, SalesRecord b) {
        return (int) (a.getTime_on_site() - (b.getTime_on_site()));
    }
}
