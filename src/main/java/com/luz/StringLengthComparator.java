package com.luz;

import java.util.Comparator;

/**
 * Created by ionut on 8/23/2017.
 */
public class StringLengthComparator implements Comparator<String> {
    public int compare(String a,String b) {
        if (a.length() <b.length()) return -1;
        else if (a.length() == b.length()) return 0;
        else return 1;
    }
}
