package com.practice.bookcase;

import java.util.ArrayList;
import java.util.Collections;

public class Lst {
    public String str;

    public static ArrayList<String> list = new ArrayList<String>();

    public Lst() {

    }
    public static ArrayList sortAscending(ArrayList<String> lst) {
        Collections.sort(lst);
        return lst;
    }

}
