package org.example.HomeWork.N22.Enum;

public class ApplesDemo {
    public static void main(String[] args) {
        for(Apples a : Apples.values()) {
            System.out.print(a);
            a.displayInfo();
            System.out.println("for 5kg price is " + a.getPrice() * 5 + "$");
            System.out.println("-----------------------------------------------");
        }

        Apples ap = Apples.valueOf("GOLDEN_DEL");
        System.out.println(ap + " location is " + ap.getLocation());
    }
}
