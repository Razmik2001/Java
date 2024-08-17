package org.example.HomeWork.N4;

public class Task1 {
    public static void main(String[] args) {
            double val1 = 1.5,val2 = 5.2,val3 = 7.5,val4 = 12;
            double res = val1 *val2 + val3/val4 + val4 -val1 + (val2 % val1);//19.625
            System.out.println("res1 = " + res);
            res = val2 - val1 + val3 * val1 - (val3 % val1);//14.95
            System.out.println("res2 = " + res);
            res+=val2/val1;
            System.out.println("res3 = " + res);
            res-= val3%val2;
            System.out.println("res4 = " + res);
            res*=val4/val2;
            System.out.println("res5 = " + res);
            res/=val1;
            System.out.println("res6 = " + res);
            res%=val4*val1-val2;
            System.out.println("res7 = " + res);

    }
}
