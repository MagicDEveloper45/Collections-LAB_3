package com.company;

import java.util.ArrayList;

public class ArrListTests {

     ArrayList<Integer> arrayList = new ArrayList<>();

     private final int arrListLenght = 1000;

     private long globalStart, globalFinish, globalElapsed;
     public long add, get, clone, set, remove;

     public void ShowResult()
     {
         arrList_ADD();
         arrList_GET();
         arrList_CLONE();
         arrList_SET();
         arrList_REMOVE();
     }

     public void arrList_ADD()
     {
         System.out.println("\n 1. ArrayList add - tests");
         globalStart = System.nanoTime();

         int leftBorder = 0;
         int rightBorder = 5000;

         for (int i = 0; i < arrListLenght;i++)
         {
             int value =  leftBorder + (int) (Math.random() * rightBorder); // taking random number from 0 to 1000

             long start = System.nanoTime();

             arrayList.add(i, value);

             long finish = System.nanoTime();
             long elapsed = finish - start;

             System.out.println(i + "th " + "add " + elapsed  + " ns");
         }

         globalFinish = System.nanoTime();
         globalElapsed = globalFinish - globalStart;

         System.out.println("\nTotal time = " + globalElapsed  + " ns, or ~ " + globalElapsed / 1000000 + " ms");

         add = globalElapsed / 1000000;

     }

     public void arrListGet(boolean way)
     {
         if (way == true) {
             randomInit();
         }
         arrList_GET();
     }

     private void arrList_GET()
    {
        System.out.println("\n 2. ArrayList get - tests");
        globalStart = System.nanoTime();

        // Test arraylist.get
        for (int i = 0; i < arrListLenght;i++)
        {
            long start = System.nanoTime();

            int number = arrayList.get(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed  + " ns. Number = " + number);
        }

        long globalFinish = System.nanoTime();
        long globalElapsed = globalFinish - globalStart;

        System.out.println("\nTotal time = " + globalElapsed  + " ns, or ~ " + globalElapsed / 1000000 + " ms");

        get = globalElapsed / 1000000;

    }

    public void arrListClone(boolean way)
    {
        if (way == true) {
            randomInit();
        }
        arrList_CLONE();
    }

    private void arrList_CLONE()
    {
        System.out.println("\n 3. ArrayList clone - tests");
        globalStart = System.nanoTime();

        ArrayList arrayListClone = new ArrayList<>(arrayList.size());

        // Test arraylist.get
        arrayListClone = (ArrayList)arrayList.clone();

        globalFinish = System.nanoTime();
        globalElapsed = globalFinish - globalStart;

        System.out.println("\nTotal time = " + globalElapsed  + " ns, or ~ " + globalElapsed / 1000000 + " ms");

        clone = globalElapsed;

    }

    public void arrListRemove(boolean way)
    {
        if (way == true) {
            randomInit();
        }
        arrList_REMOVE();
    }

    private void arrList_REMOVE() {
        System.out.println("\n 4. ArrayList remove - tests");
        globalStart = System.nanoTime();

        // Test arraylist.remove
        for (int i = 0; i < arrListLenght / 2 - 1; i++) {
            long start = System.nanoTime();

            arrayList.remove(i);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed + " ns");
        }

        globalFinish = System.nanoTime();
        globalElapsed = globalFinish - globalStart;

        System.out.println("\nTotal time = " + globalElapsed + " ns, or ~ " + globalElapsed / 1000000 + " 1ms");

        remove = globalElapsed / 1000000;

    }

    public void arrListSet(boolean way)
    {
        if (way == true)
        {
            randomInit();
        }
        arrList_SET();
    }

    private void arrList_SET()
    {
        System.out.println("\n 4. ArrayList set - tests");
        globalStart = System.nanoTime();

        // Test arraylist.set
        for (int i = 0; i < arrListLenght / 2 - 1; i++) {
            long start = System.nanoTime();

            int value = 666;
            arrayList.set(i, value);

            long finish = System.nanoTime();
            long elapsed = finish - start;

            System.out.println(i + "th " + "add " + elapsed + " ns");
        }

        globalFinish = System.nanoTime();
        globalElapsed = globalFinish - globalStart;

        System.out.println("\nTotal time = " + globalElapsed + " ns, or ~ " + globalElapsed / 1000000 + " 1ms");

        set = globalElapsed;
    }

    private void randomInit()
    {
        int leftBorder = 0;
        int rightBorder = 5000;

        for (int i = 0; i < arrListLenght;i++)
        {
            int value =  leftBorder + (int) (Math.random() * rightBorder); // taking random number from 0 to 1000
            arrayList.add(i, value);
        }
    }

}
