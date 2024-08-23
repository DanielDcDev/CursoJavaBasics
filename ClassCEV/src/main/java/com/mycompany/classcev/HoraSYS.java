package com.mycompany.classcev;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.*;

public class HoraSYS {
    public static void main(String[] args) {
        Date dataAt = new Date();
        Locale loc = Locale.getDefault();
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        
        System.out.print("the time in the system is: ");
        System.out.println(dataAt.toString());
        System.out.print("the linguage in the system is: ");
        System.out.println(loc.getDisplayLanguage()+ " : " +loc.getLanguage());
        System.out.print("Screen width = " + d.width +", ");
        System.out.println("Screen height = " + d.height);
    }
}
