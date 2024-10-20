package org.example.classInJava.generic;

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob;

        iob = new NonGen(88);
        iob.showType();

        int v = (Integer) iob.getOb();
        System.out.println("Values: " + v);
        System.out.println();

        NonGen strOb =new NonGen("String generic");
        strOb.showType();
        String str =(String) strOb.getOb();
        System.out.println("Values: " + str);
        System.out.println();

        iob = strOb;
        v = (Integer) iob.getOb();
        System.out.println(v);
        //run time error
    }
}
