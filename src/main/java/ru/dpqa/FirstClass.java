package ru.dpqa;

import java.util.List;

public class FirstClass {
    public static void main(String... args) {
        System.out.println("___Математические операторы");
        // byte + byte
        System.out.println("___byte + byte");
        byte aByte = 100;
        byte bByte = 5;
        System.out.println("(byte) 100 * 5 = " + (aByte + bByte));

        // int, переполнение
        System.out.println("\n___int, переполнение");
        Integer maxInt = Integer.MAX_VALUE;
        Integer minInt = Integer.MIN_VALUE;
        System.out.println("max int: " + maxInt);
        System.out.println("min int: " + minInt);
        Integer aInt = 123456;
        Integer bInt = 20000;
        System.out.println("(int) 123456 * 20000 = " + aInt * bInt);
        // 123 456 * 20 000 = 2 469 120 000, но максимальное int = 2^31-1 = 2 147 483 647
        // от 0 до Integer.MAX_VALUE = 2 147 483 647
        // +1 = перешли на Integer.MIN_VALUE = -2 147 483 648
        // остаток (2 469 120 000 - 2 147 483 647 - 1 = 321 636 352)
        // + остаток = (Integer.MIN_VALUE + остаток) =  -2 147 483 648 + 321 636 352 = -1 825 847 296
        System.out.println("++max_int = " + ++maxInt);


        // double * ...
        System.out.println("\n___double * ...");
        System.out.println("35.98 * 8 = " + (35.98 * 8));
        System.out.println("35.98d * 8 = " + (35.98d * 8));
        System.out.println("35.98 * 8.05 = " + (35.98 * 8.05));

        // int / ...
        System.out.println("\n___int / ...");
        System.out.println("35 / 8 = " + (35 / 8));
        System.out.println("35 / 8 / 6 = " + (35 / 8 / 6));
        System.out.println("35 / 8.05 = " + (35 / 8.05));
        System.out.println("35 / 8.05 / 6 = " + (35 / 8.05 / 6));

        // double / ...
        System.out.println("\n___double / ...");
        System.out.println("1058.41695 / 8 = " + (1058.41695 / 8));
        System.out.println("1058.41695 / 8.8787 = " + (1058.41695 / 8.8787));

        // int % int
        System.out.println("\n___int % int");
        System.out.println("35 % 8 = " + (35 % 8));

        // Логические и сравнение
        System.out.println("\n___Логические операторы и операторы сравнения");
        System.out.println(158 == 158 && 600 != 500 && 800 > 500 && 156 < 584 && 236 >= 236 && 236 <= 236);
        System.out.println(158 == 158 & 600 != 500 & 800 > 500 & 156 < 584 & 236 >= 236 & 236 <= 236);
        System.out.println(158 == 158 || 158 == 500);
        System.out.println(158 == 158 | 158 == 500);
        String sNull = null;
        System.out.println(158 == 158 || sNull.equals("500"));
        // System.out.println(158 == 158 | sNull.equals("500")); // падает с ошибкой
        System.out.println(!(158 == 158) && 158 == 500);

        // Порядок
        System.out.println("\n___Порядок выполнения операций");
        System.out.println("10 + 5 * 8 - 7 / 6 % 2 = " + (10 + 5 * 8 - 7 / 6 % 2));
    }
}
