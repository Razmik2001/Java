package org.example;

public class HomWork {
    public static void main(String[] args) {
        //part1
        {
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
        //part2
        {
            int val = 42154;
            if (val % 2 == 0)
            {
                System.out.println("val is even number");
            }
            else
            {
                System.out.println("val is odd number");
            }
        }
        //part3
        {
            int val = 4524;
            {
                System.out.println(val/10 % 2);
                if (val/10 % 2 == 0)
                {
                    System.out.println("the third digit in a number is an even number");
                }
                else
                {
                    System.out.println("the third digit in a number is an odd number");
                }
            }
        }
    }
}
