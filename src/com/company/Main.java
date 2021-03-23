package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void ArrListTests()
    {
        ArrayList<Integer> arrayList = new ArrayList<>();

        int leftBorder = 0, rightBorder = 5000;
        int arrayListLenght = 1000;

        /***************************************************************************************************************/

        System.out.println("\n 1. ArrayList add - tests");
        long globalStart_1 = System.nanoTime();

        // Test arraylist.add
        for (int i = 0; i < arrayListLenght;i++)
        {
            int value =  leftBorder + (int) (Math.random() * rightBorder); // taking random number from 0 to 1000

            long start = System.nanoTime();

            arrayList.add(i, value);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        long globalFinish_1 = System.nanoTime();
        long globalElapsed_1 = globalFinish_1 - globalStart_1;

        System.out.println("\nTotal time = " + globalElapsed_1  + " ns, or ~ " + globalElapsed_1 / 1000000 + " ms");

        /***************************************************************************************************************/

        System.out.println("\n 2. ArrayList get - tests");
        long globalStart_2 = System.nanoTime();

        // Test arraylist.get
        for (int i = 0; i < arrayListLenght;i++)
        {
            long start = System.nanoTime();

            int number = arrayList.get(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns. Number = " + number);
        }

        long globalFinish_2 = System.nanoTime();
        long globalElapsed_2 = globalFinish_2 - globalStart_2;

        System.out.println("\nTotal time = " + globalElapsed_2  + " ns, or ~ " + globalElapsed_2 / 1000000 + " ms");

        /***************************************************************************************************************/

        System.out.println("\n 3. ArrayList clone - tests");
        long globalStart_3 = System.nanoTime();

        ArrayList<Integer> arrayListClone = new ArrayList<>(arrayList.size());

        // Test arraylist.get
        arrayListClone = (ArrayList)arrayList.clone();

        long globalFinish_3 = System.nanoTime();
        long globalElapsed_3 = globalFinish_3 - globalStart_3;

        System.out.println("\nTotal time = " + globalElapsed_3  + " ns, or ~ " + globalElapsed_3 / 1000000 + " ms");

        /***************************************************************************************************************/

        System.out.println("\n 4. ArrayList remove - tests");
        long globalStart_4 = System.nanoTime();

        // Test arraylist.remove
        for (int i = 0; i < arrayListLenght/2 - 1;i++)
        {
            long start = System.nanoTime();

            arrayList.remove(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        long globalFinish_4 = System.nanoTime();
        long globalElapsed_4 = globalFinish_4 - globalStart_4;

        System.out.println("\nTotal time = " + globalElapsed_4  + " ns, or ~ " + globalElapsed_4 / 1000000 + " 1ms");
    }

    public static void LinkListTests()
    {
        LinkedList<Integer> arrayList = new LinkedList<>();

        int leftBorder = 0, rightBorder = 5000;
        int arrayListLenght = 1000;

        /***************************************************************************************************************/

        System.out.println("\n 1. ArrayList add - tests");
        long globalStart_1 = System.nanoTime();

        // Test arraylist.add
        for (int i = 0; i < arrayListLenght;i++)
        {
            int value =  leftBorder + (int) (Math.random() * rightBorder); // taking random number from 0 to 1000

            long start = System.nanoTime();

            arrayList.add(i, value);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        long globalFinish_1 = System.nanoTime();
        long globalElapsed_1 = globalFinish_1 - globalStart_1;

        System.out.println("\nTotal time = " + globalElapsed_1  + " ns, or ~ " + globalElapsed_1 / 1000000 + " ms");

        /***************************************************************************************************************/

        System.out.println("\n 2. ArrayList get - tests");
        long globalStart_2 = System.nanoTime();

        // Test arraylist.get
        for (int i = 0; i < arrayListLenght;i++)
        {
            long start = System.nanoTime();

            int number = arrayList.get(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns. Number = " + number);
        }

        long globalFinish_2 = System.nanoTime();
        long globalElapsed_2 = globalFinish_2 - globalStart_2;

        System.out.println("\nTotal time = " + globalElapsed_2  + " ns, or ~ " + globalElapsed_2 / 1000000 + " ms");

        /***************************************************************************************************************/

        System.out.println("\n 3. ArrayList clone - tests");
        long globalStart_3 = System.nanoTime();

        LinkedList<Integer> arrayListClone = new LinkedList<Integer>();

        // Test arraylist.get
        arrayListClone = (LinkedList)arrayList.clone();

        long globalFinish_3 = System.nanoTime();
        long globalElapsed_3 = globalFinish_3 - globalStart_3;

        System.out.println("\nTotal time = " + globalElapsed_3  + " ns, or ~ " + globalElapsed_3 / 1000000 + " ms");

        /***************************************************************************************************************/

        System.out.println("\n 4. ArrayList remove - tests");
        long globalStart_4 = System.nanoTime();

        // Test arraylist.remove
        for (int i = 0; i < arrayListLenght/2 - 1;i++)
        {
            long start = System.nanoTime();

            arrayList.remove(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns");
        }

        long globalFinish_4 = System.nanoTime();
        long globalElapsed_4 = globalFinish_4 - globalStart_4;

        System.out.println("\nTotal time = " + globalElapsed_4  + " ns, or ~ " + globalElapsed_4 / 1000000 + " 1ms");
    }

    public static void ShowResult()
    {

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choose;

        do {
            System.out.println("Choose type of collection \nArrayList - 1, LinkedList - 2, Show result - 3 \ninput:");
            choose = Integer.parseInt(in.nextLine());
        }while (choose != 1 && choose != 2);

        switch (choose)
        {
            case 1:ArrListTests();
            case 2:LinkListTests();
            case 3: ShowResult();
            default: return;
        }





    }
}
