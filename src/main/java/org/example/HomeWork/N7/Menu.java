package org.example.HomeWork.N7;

import java.io.IOException;

public class Menu {
    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println("Operator help:");
            System.out.println("    1. if");
            System.out.println("    2. switch");
            System.out.println("    3. while");
            System.out.println("    4. do-while");
            System.out.println("    5. for\n");
            System.out.println("Select the desired item:");
            choice = (char) System.in.read();
        }
        while (choice < '1' || choice > '5');

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if(condition) operator;");
                System.out.println("else operator;");
                System.out.println("example");
                System.out.println("example\n" +
                        "int val = 4524;\n" +
                        "if (val / 10 % 2 == 0)\n" +
                        "{\n" +
                        "    System.out.println(\"the third digit in a number is an even number\");\n" +
                        "}\n" +
                        "else\n" +
                        "{\n" +
                        "    System.out.println(\"the third digit in a number is an odd number\");\n" +
                        "}");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch (expression) {");
                System.out.println(" сазе constant:");
                System.out.println(" sequence of operators");
                System.out.println(" break;");
                System.out.println(" // . . . ");
                System.out.println("}");
                System.out.println("example\n"+"byte month = 5;\n" +
                        "switch (month) {\n" +
                        "    case 12:\n" +
                        "    case 1:\n" +
                        "    case 2:\n" +
                        "        System.out.println(\"winter\");\n" +
                        "        break;\n" +
                        "    case 3:\n" +
                        "    case 4:\n" +
                        "    case 5:\n" +
                        "        System.out.println(\"spring\");\n" +
                        "        break;\n" +
                        "    case 6:\n" +
                        "    case 7:\n" +
                        "    case 8:\n" +
                        "        System.out.println(\"summer\");\n" +
                        "        break;\n" +
                        "    case 9:\n" +
                        "    case 10:\n" +
                        "    case 11:\n" +
                        "        System.out.println(\"autumn\");\n" +
                        "        break;\n" +
                        "    default:\n" +
                        "        System.out.println(\"wrong number\");\n" +
                        "}"
                );
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while(condition) оператор; ");
                System.out.println("example\n" +"byte tact = sc.nextByte();\n" +
                        "int prePre = 1;\n" +
                        "int pre = 1;\n" +
                        "int fibonachi = 1;\n" +
                        "while (tact > 2) {\n" +
                        "    fibonachi = prePre + pre;\n" +
                        "    prePre = pre;\n" +
                        "    pre = fibonachi;\n" +
                        "    --tact;\n" +
                        "}\n" +
                        "System.out.println(tact >= 0 ? \"your number is \" + fibonachi : \"wrong number\");"
                );
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println(" operator;");
                System.out.println("} while (condition) ;");
                System.out.println("example\n" +
                "int i = 1;\n" +
                        "do {\n" +
                        "    System.out.println(i);\n" +
                        "    i++;\n" +
                        "} while (i <= 5);");
                break;
            case '5':
                System.out.println("for:\n");
                System.out.print("for(initialization; condition; iteration) ");
                System.out.println(" operator;");
                break;
        }
    }
}