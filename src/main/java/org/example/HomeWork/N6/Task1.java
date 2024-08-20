package org.example.HomeWork.N6;

public class Task1 {
    public static void main(String[] args) {
        char ch = 'c';
        switch (ch) {
            case 'a':
            case 'A':
            case 'o':
            case 'O':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'u':
            case 'U':
                System.out.println(ch + " is a vowel");
                break;
            default:
                System.out.println(ch + " isn't a vowel");
        }
    }
}
