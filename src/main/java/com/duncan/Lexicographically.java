package com.duncan;

public class Lexicographically {

    static boolean isSorted(String[] a){
        for (int i=1; i<a.length; i++)
            if (a[i-1].compareTo(a[i]) > 0)
            return false;
            return true;
}
}
