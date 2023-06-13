package org.fasttrackit;
import java.util.Scanner;


public class TemaConf {
    public static void main(String[] args) {
        //String a = "testare";
        //CountChar(a);
        System.out.println(Redactare("suc"));
        String[] nume = {"Ana" , "are" , "mere"};
        System.out.println(GasireaVectorilor(nume,"are"));

    }
    static  void CountChar(String abc) {
        Scanner console = new Scanner(System.in);
        char a = console.next().charAt(0);
        int b = 0;
        for ( int i = 0; i < abc.length(); i++){
            if ( abc.charAt(i) == a)
                b+=1;
        }
        System.out.println(b);

    }
    static String Redactare(String abc) {
        String nou = "*";
        for (int i = 0; i < abc.length() - 1; i++){
          nou =  nou.concat("*");

        }
        return nou;
    }

    static Boolean GasireaVectorilor(String[] vec, String abc) {
            int a = 0;
        for ( int i = 0; i < vec.length; i ++) {
            if(vec[i] == abc)
                a = 1;
        }
        if (a == 1)
            return true;
        else
            return false;
    }

}
