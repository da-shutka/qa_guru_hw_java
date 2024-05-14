package ru.dpqa;

import java.util.*;

public class SecondClass {
    public static void main(String[] args) {

        Human daria = new Human("Daria", 32, true);
        //daria = new Human("Daria", 33, true);
        System.out.println(daria);
//        System.out.println("Name: " + daria.name);
//        System.out.println("Age: " + daria.age);
//        System.out.println("Cute: " + daria.isCute);

//        daria.setName("Daria");
//        daria.setAge(32);
//        daria.setCute(true);

//        System.out.println("Name: " + daria.name);
//        System.out.println("Age: " + daria.age);
//        System.out.println("Cute: " + daria.isCute);

//        daria.setName("Maria");
        daria = daria.incrementAge();
        System.out.println(daria);

        daria.sayHelloNonStatic();
        //daria.sayHello();

        Human.sayHello();

        Math.addExact(10, 20);

        //------------------
        int intVar = 12;
        String hello = "Hello";
        List<String> lectures = new ArrayList<>();
        lectures.add("git");
        lectures.add("java");
        lectures.add("files");
        lectures.add("junit");

        daria.printSomeValues(
                intVar,
                hello,
                lectures
        );
        System.out.println("After method:" + intVar);
        System.out.println("After method:" + hello);
        System.out.println("After method:" + lectures);

        String[] lectArray = new String[4];
        lectArray[0] = "git";
        lectArray[1] = "java";
        lectArray[2] = "files";
        lectArray[3] = "junit";

        //String[] lectArray = new String[] {"git", "java", "files", "junit"};

        //lectArray.length;

        int[] intArray0 = new int[] {1,2,3};
        int[] intArray1 = new int[] {1,2,3};

        int[][] binArray0 = new int[][]{
                intArray0,
                intArray1
        };

        int[][] binArray1 = new int[][]{
                intArray0,
                intArray1
        };

        int[][][] threeArray = new int[][][] {
                binArray0,
                binArray1
        };

        Set<String> lectSet = Set.of("git", "java", "files", "junit"); //new HasSet

        Map<String, Human> humans = new HashMap<>();
        humans.put("3211 045555", daria);
        humans.put("3211 485145", daria);
        humans.put("3211 965454", daria);
        humans.put("3211 215222", daria);
        humans.put("3211 321111", daria);
        humans.put("3211 854111", daria);

        for (Map.Entry<String, Human> entry : humans.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        for (String s : humans.keySet()) {
            
        }

        for (Human value : humans.values()) {
            
        }


        //--------------------------------------
        System.out.println("\narray 0->3:");
        for (int i = 0; i < lectArray.length; i++) {
            System.out.println(lectArray[i]);
        }

        System.out.println("\narray 3->0:");
        for (int i = lectArray.length -1 ; i >= 0; i--) {
            System.out.println(lectArray[i]);
        }

        System.out.println("\nWithout index:");
        for (String lectName : lectArray) {
            System.out.println(lectName);
        }

        System.out.println("\n While:");
        int index = 0;
        while (index < lectArray.length) {
            System.out.println(lectArray[index]);
            index++;
        }

        System.out.println("\nDo while:");
        index = 0;
        do {
            System.out.println(lectArray[index]);
            index++;
        } while (index < lectArray.length);

        System.out.println("\nPrint only j starting:"); //java + junit
        for (String lectName : lectArray) {
            if (lectName.startsWith("j")) {
                System.out.println(lectName);
            }
        }

        System.out.println("\nPrint first j starting:"); //java
        for (String lectName : lectArray) {
            if (lectName.startsWith("j")) {
                System.out.println(lectName);
                break;
            }
        }

        System.out.println("\nPrint j starting:"); //java + junit
        for (String lectName : lectArray) {
            if (!lectName.startsWith("j")) {
                continue;
            }
            System.out.println(lectName);
        }

        System.out.println("\nPrint first j starting:"); //java
        for (String lectName : lectArray) {
            if (!lectName.startsWith("j")) {
                continue;
            }
            System.out.println(lectName);
            break;
        }

        System.out.println("\nPrint first j starting:"); //java
        for (String lectName : lectArray) {
            if (!lectName.startsWith("j")) {
                continue;
            }
            System.out.println(lectName);
            return;
        }



        //System.out.println(lectArray);


    }
}
