package ru.dpqa;

import java.util.List;

public class Example {
    public static void exampleFromLesson(){
        //Целочисленные типы
        byte aByte = 0; // 8 бит, (-2^8)  (2^8-1), -128  +127
        short aShort = 0; // 16 бит, (-2^16)  (2^16-1), -32768  +32767
        int aInt = 0;  // 32 бита, (-2^31)  (2^31-1)
        Integer intWrapper = 0;
        long aLong = 0L; // 64 бита, (-2^63)  (2^63-1)

        // С плавающей точкой (арифметика не точна)
        float aFloat = 0.0F; //
        double aDouble = 0.0; // 64 бита

        // Символьный тип
        char aChar = 'a';
        Character charWrapper = 'b';

        // Логический тип
        boolean aBoolean = true;
        Boolean boolWrapper = true;

        // Строка - не примитивный (объектный/ссылочный тип данных), класс
        String printedString = "Hello world!";
        List<String> teachers = List.of("First", "Second");

        // ------------------------------------------------------------------
        // Операторы

        // Оператор присвоения =
        String name = "Daria";

        // Арифметические + - / * % ++ --
        System.out.println(4.0 + 3); // 7.0 - берется старший (double), по нему определяется какой результирующий
        System.out.println(4.0 / 3); // double
        System.out.println(4 / 3); // = 1, int, отбрасывается остаток, если над целыми числами
        System.out.println(++aInt);
        System.out.println(--aInt);

        // Операторы сравнения <, >, <=, >=, !=, == - всегда возвращают тип boolean
        System.out.println(4 > 3);
        String nameFirst = "Daria";
        String nameSecond = "Daria";
        System.out.println(nameFirst.equals(nameSecond)); // нельзя строки сравнивать операторами сравнения

        // Логические &, |, && (двойной не вычисляет остаток выражения, если результат уже известен), ||, ^ (аналог !=), !
        String myName = "Daria";
        int myAge = 32;
        System.out.println(myName.equals("Daria") && myAge == 32); // true
        System.out.println(myName.equals("Daria") && myAge == 35); // false
        System.out.println(myName.equals("Daria") || myAge == 77); // true
        System.out.println(!(myName.equals("Daria") || myAge == 77)); // false

        // Оператор instanceof
        System.out.println(nameFirst instanceof String); // true
        System.out.println(!(nameFirst instanceof String)); // false

        // Тернарный оператор -- там, где можно вернуть результат
        char sex = 'm';
        String babyName = sex == 'm'
                ? "Valentin" // если истина
                : "Valentina"; // если ложь

        // Управляющая конструкция if - там, где не надо возвращать результат
        if (sex == 'm') {
            //babyName = "Valentin";
            System.out.println("Мальчик!");
        } else if (sex == 'w') {
            //babyName = "Valentina";
            System.out.println("Девочка!");
        } else {
            System.out.println("Неизвестный:(");
        }

        // Ключевое слово New (для создания объекта)
        String dName = new String("Dasha"); // но не нужно использовать New, можно использовать литерал, но для других New обязательно

        System.out.println(printedString);
    }
}
