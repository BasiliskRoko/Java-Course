package com.bercut.course;

import java.util.Comparator;

public class SortByProperty implements Comparator<Property> {
    public int compare(Property a, Property b) {
        if ( a.GetMinValue() < b.GetMinValue() ) return -1;
        else if ( a.GetMinValue() == b.GetMinValue() ) return 0;
        else return 1;
    }
}
