package org.example.classInJava.encapsulation;

public class Test1 {

    public static final String URL = "http://localhost:8083/api/v1/internal";
    public static final int BOOKS_COUNT = 10;

    public static final String PDF_EXTENSION = "pdf";
    public static final String JSON_EXTENSION = "json";
    public static final String EXCEL_EXTENSION = "exl";


    public static void main(String[] args) {
        System.out.println(URL);
        System.out.println(BOOKS_COUNT);
        System.out.println("newBook." + PDF_EXTENSION);
    }
}
