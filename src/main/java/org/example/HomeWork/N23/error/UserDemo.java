package org.example.HomeWork.N23.error;

import java.util.Scanner;

public class UserDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("chose error {NOT_FOUND,UNAUTHORIZED,SERVER_ERROR,BAD_REQUEST,FORBIDDEN}");
        Error error = Error.valueOf(sc.nextLine().toUpperCase());
        switch (error) {
            case FORBIDDEN ->
                    System.out.println("The client is authenticated but does not have permission to access the requested resource.");
            case NOT_FOUND ->
                    System.out.println("This error indicates that the requested resource could not be found on the server." +
                            " It often occurs when a URL is mistyped, a page is moved or deleted, or a resource no longer exists.");
            case BAD_REQUEST ->
                    System.out.println("The server cannot process the request due to client-side errors, such as invalid syntax or missing required parameters.");
            case SERVER_ERROR ->
                    System.out.println("This error indicates that there was an internal server error while processing the request. " +
                            "It could be due to a bug in the server-side application logic, database issues, or other unforeseen problems.");
            case UNAUTHORIZED ->
                    System.out.println("This status code means that access to the resource is restricted, and authentication is required. " +
                            "It commonly occurs when trying to access a protected resource without proper authorization credentials");
            default -> System.out.println("unedifying error");
        }
    }
}
