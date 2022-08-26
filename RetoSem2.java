package com.company;

import java.util.Arrays;

public class RetoSem2 {
    public static void main(String[] args) {
        String param1 = "mIo";
        String param2 = "oiM";

        if (param1.length() != param2.length()) {
            System.out.println("No es anagrama");
        } else {
            char[] w1=param1.toLowerCase().toCharArray();
            char[] w2=param2.toLowerCase().toCharArray();

            Arrays.sort(w1);
            Arrays.sort(w2);

            if (Arrays.equals(w1,w2)) {
                System.out.println(w1 + "Es  anagrama de "+w2);
            } else {
                System.out.println(w1 + " No es Anagrama de " + w2);
            }
        }

    }

}







