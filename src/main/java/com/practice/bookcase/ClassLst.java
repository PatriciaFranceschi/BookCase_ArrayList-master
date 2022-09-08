package com.practice.bookcase;

import java.util.ArrayList;
import java.util.Collections;

public class ClassLst {
    public static String str;
    private String sInput;

    public static ArrayList<String> list = new ArrayList<String>();

    public ClassLst() {

    }
    public static ArrayList sortAscending(ArrayList<String> lst) {
        Collections.sort(lst);
        return lst;
    }

}
